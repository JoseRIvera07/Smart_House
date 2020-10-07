import { Injectable } from '@angular/core';
import * as io from 'socket.io-client';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SocketioService {
  socket;
  constructor() { }
  setupSocketConnection() {
    this.socket = io(environment.SOCKET_ENDPOINT);
  }

  setUpPins(msg){
    this.socket.emit('setup', `${msg}`);
  }

  switchLight(msg){
    this.socket.emit('switch', `${msg}`);
  }

  verifyDoor(msg){
    this.socket.emit('verify', `${msg}`);
    return new Observable((subscriber) =>{
      this.socket.on('response', (data: string) => {
        subscriber.next(data);
      });

    });
  }

}
