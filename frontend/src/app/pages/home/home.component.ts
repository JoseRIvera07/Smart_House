import { Component, OnInit } from '@angular/core';
import { SocketioService } from 'src/app/socketio.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {

  block_size = 10;

  constructor(private socketService: SocketioService) {
    this.socketService.setUpPins('gpioMain pinMode 4 1');
    this.socketService.setUpPins('gpioMain pinMode 17 1');
    this.socketService.setUpPins('gpioMain pinMode 27 1');
    this.socketService.setUpPins('gpioMain pinMode 22 1');
    this.socketService.setUpPins('gpioMain pinMode 10 1');

    this.socketService.setUpPins('gpioMain pinMode 14 0');
    this.socketService.setUpPins('gpioMain pinMode 15 0');
    this.socketService.setUpPins('gpioMain pinMode 18 0');
    this.socketService.setUpPins('gpioMain pinMode 23 0');
    
  }

  rooms = {
    'Cuarto 1': { //cocina
      class: 'room-off',
      pin: 4,
      x: this.block_size,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Cuarto 2': {
      class: 'room-off',
      pin: 17,
      x: this.block_size,
      y: this.block_size * 22,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Sala': {
      class: 'room-off',
      pin: 27,
      x: this.block_size * 22,
      y: this.block_size * 22,
      width: this.block_size * 41,
      height: this.block_size * 20
    },
    'Cocina': {
      class: 'room-off',
      pin: 22,
      x: this.block_size * 22,
      y: this.block_size,
      width: this.block_size * 21,
      height: this.block_size * 20
    },
    'Comedor': {
      class: 'room-off',
      pin: 10,
      x: this.block_size * 43,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 20
    }
  }

  doors = {
    14: {
      x: this.rooms['Comedor'].x + this.rooms['Comedor'].width/2 - this.block_size * 2.5,
      y: this.rooms['Comedor'].y + this.block_size*20,
      width: this.block_size * 5,
      height: this.block_size
    },
    15: {
      x: this.rooms['Sala'].x + this.rooms['Sala'].width/2 - this.block_size * 2.5,
      y: this.rooms['Sala'].y + this.rooms['Sala'].height,
      width: this.block_size * 5,
      height: this.block_size
    },
    18: {
      x: this.rooms['Cuarto 2'].x + this.rooms['Cuarto 2'].width,
      y: this.rooms['Cuarto 2'].y + this.rooms['Cuarto 2'].height/2 - this.block_size * 2.5,
      width: this.block_size,
      height: this.block_size * 5
    },
    23: {
      x: this.rooms['Cuarto 1'].x + this.rooms['Cuarto 1'].width,
      y: this.rooms['Cuarto 1'].y + this.rooms['Cuarto 1'].height/2 - this.block_size * 2.5,
      width: this.block_size,
      height: this.block_size  * 5
    }
  }
  doorPins = [14,15,18,23]
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
      this.socketService.switchLight(`gpioMain digitalWrite ${room.pin} ${0}`);
    }else{
      room.class = 'room-on';
      this.socketService.switchLight(`gpioMain digitalWrite ${room.pin} ${1}`);
    }
  }

  setDoorState(pin, state){
    if(state == '1'){
      if(this.doors[pin]==14 || this.doors[pin]==15){
        this.doors[pin].width = this.block_size * 5;
        this.doors[pin].height = this.block_size;
      }
      else{
        this.doors[pin].width = this.block_size;
        this.doors[pin].height = this.block_size * 5;
      }
    }else{
      if(this.doors[pin]==14 || this.doors[pin]==15){
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
    this.socketService.verifyDoor(`gpioMain digitalRead ${pin}`).subscribe((data:string) => {
      this.setDoorState(pin, data);
    });
  }

  //-------------------------- NEW METHOD MARY
  photo(){
    this.socketService.takePhoto().subscribe((data:string) => {
      var img = document.getElementById('image')
      console.log(data)
      img.setAttribute('src','data:image/jpeg;base64'+ data)
    });
  }

}