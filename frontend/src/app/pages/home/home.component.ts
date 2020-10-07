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
    'Kitchen': {
      class: 'room-off',
      pin: 4,
      x: this.block_size,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 21
    },
    'Dinning room': {
      class: 'room-off',
      pin: 17,
      x: this.block_size,
      y: this.block_size * 22,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Living room': {
      class: 'room-off',
      pin: 27,
      x: this.block_size * 21,
      y: this.block_size * 22,
      width: this.block_size * 42,
      height: this.block_size * 20
    },
    'First room': {
      class: 'room-off',
      pin: 22,
      x: this.block_size * 22,
      y: this.block_size,
      width: this.block_size * 20,
      height: this.block_size * 20
    },
    'Second room': {
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
      x: this.rooms['Kitchen'].x + this.rooms['Kitchen'].width/2 - this.block_size * 2.5,
      y: this.rooms['Kitchen'].y - this.block_size,
      width: this.block_size * 5,
      height: this.block_size
    },
    15: {
      x: this.rooms['Living room'].x + this.rooms['Living room'].width/2 - this.block_size * 2.5,
      y: this.rooms['Living room'].y + this.rooms['Living room'].height,
      width: this.block_size * 5,
      height: this.block_size
    },
    18: {
      x: this.rooms['First room'].x + this.rooms['First room'].width/2 - this.block_size * 2.5,
      y: this.rooms['First room'].y + this.rooms['First room'].height,
      width: this.block_size * 5,
      height: this.block_size
    },
    23: {
      x: this.rooms['Second room'].x + this.rooms['Second room'].width/2 - this.block_size * 2.5,
      y: this.rooms['Second room'].y + this.rooms['Second room'].height,
      width: this.block_size * 5,
      height: this.block_size
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
      this.doors[pin].width = this.block_size * 5;
      this.doors[pin].height = this.block_size;
    }else{
      this.doors[pin].width = this.block_size;
      this.doors[pin].height = this.block_size * 5;
    }
  }

  refreshData(pin){
    this.socketService.verifyDoor(`gpioMain digitalRead ${pin}`).subscribe((data:string) => {
      this.setDoorState(pin, data);
    });
  }

}