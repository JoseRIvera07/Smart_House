import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import {URLS} from '../config/constants'
import { LoginResponse } from '../models/login-response';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  logIn(data): Observable<LoginResponse> {
    return  this.http.post<LoginResponse>(URLS.baseURL+'/api/authentication/login', data)
  }
}
