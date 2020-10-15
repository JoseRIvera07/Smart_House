import { Component, OnInit } from '@angular/core';
import { SocketioService } from 'src/app/socketio.service';

@Component({
  selector: 'app-smarthome',
  templateUrl: './smarthome.component.html',
  styleUrls: ['./smarthome.component.css']
})

export class SmartHomeComponent implements OnInit {

  block_size = 10;

  constructor(private socketService: SocketioService) {
    this.socketService.setUpPins('gpio pinMode 7 1');
    this.socketService.setUpPins('gpio pinMode 11 1');
    this.socketService.setUpPins('gpio pinMode 13 1');
    this.socketService.setUpPins('gpio pinMode 15 1');
    this.socketService.setUpPins('gpio pinMode 12 1');

    this.socketService.setUpPins('gpio pinMode 29 0');
    this.socketService.setUpPins('gpio pinMode 31 0');
    this.socketService.setUpPins('gpio pinMode 33 0');
    this.socketService.setUpPins('gpio pinMode 37 0');
    
  }

  rooms = {
    'Cuarto 1': { //cocina
      class: 'room-off',
      pin: 7,
      x: this.block_size,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Cuarto 2': {
      class: 'room-off',
      pin: 11,
      x: this.block_size,
      y: this.block_size * 22,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Sala': {
      class: 'room-off',
      pin: 13,
      x: this.block_size * 22,
      y: this.block_size * 22,
      width: this.block_size * 41,
      height: this.block_size * 20
    },
    'Cocina': {
      class: 'room-off',
      pin: 15,
      x: this.block_size * 22,
      y: this.block_size,
      width: this.block_size * 21,
      height: this.block_size * 20
    },
    'Comedor': {
      class: 'room-off',
      pin: 12,
      x: this.block_size * 43,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 20
    }
  }

  doors = {
    29: {
      x: this.rooms['Comedor'].x + this.rooms['Comedor'].width/2 - this.block_size * 2.5,
      y: this.rooms['Comedor'].y + this.block_size*20,
      width: this.block_size * 5,
      height: this.block_size
    },
    31: {
      x: this.rooms['Sala'].x + this.rooms['Sala'].width/2 - this.block_size * 2.5,
      y: this.rooms['Sala'].y + this.rooms['Sala'].height,
      width: this.block_size * 5,
      height: this.block_size
    },
    33: {
      x: this.rooms['Cuarto 2'].x + this.rooms['Cuarto 2'].width,
      y: this.rooms['Cuarto 2'].y + this.rooms['Cuarto 2'].height/2 - this.block_size * 2.5,
      width: this.block_size,
      height: this.block_size * 5
    },
    37: {
      x: this.rooms['Cuarto 1'].x + this.rooms['Cuarto 1'].width,
      y: this.rooms['Cuarto 1'].y + this.rooms['Cuarto 1'].height/2 - this.block_size * 2.5,
      width: this.block_size,
      height: this.block_size  * 5
    }
  }
  doorPins = [29,31,33,37]
  ngOnInit(){
    var myInterval = null;
    if (myInterval == null){
      myInterval = setInterval(() => {
        for (let i=0; i<4; i++){
          this.refreshData(this.doorPins[i]);
        }
      }, 5000);
    }
  }

  roomClick(room){
    if(room.class == 'room-on'){
      room.class = 'room-off';
      this.socketService.switchLight(`gpio digitalWrite ${room.pin} ${0}`);
    }else{
      room.class = 'room-on';
      this.socketService.switchLight(`gpio digitalWrite ${room.pin} ${1}`);
    }
  }

  setDoorState(pin, state){
    if(state == '1'){
      if(this.doors[pin]==29 || this.doors[pin]==31){
        this.doors[pin].width = this.block_size * 5;
        this.doors[pin].height = this.block_size;
      }
      else{
        this.doors[pin].width = this.block_size;
        this.doors[pin].height = this.block_size * 5;
      }
    }else{
      if(this.doors[pin]==29 || this.doors[pin]==31){
        this.doors[pin].width = this.block_size;
        this.doors[pin].height = this.block_size * 5;
      }
      else{
        this.doors[pin].width = this.block_size * 5;
        this.doors[pin].height = this.block_size;
      }
    }
  }

  refreshData(pin){
    this.socketService.verifyDoor(`gpio digitalRead ${pin}`).subscribe((data:string) => {
      this.setDoorState(pin, data);
    });
  }

  photo(){
    this.socketService.takePhoto().subscribe((data:string) => {
      var img = document.getElementById('image')
      console.log(data)
      img.setAttribute('src','data:image/jpeg;base64'+ data)
    });
  }

}