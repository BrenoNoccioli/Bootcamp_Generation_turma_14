import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Tema } from '../model/Tema';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(
    private http:HttpClient
  ) { }

  token={ //criação de objeto token para autenticar as requisições
    headers: new HttpHeaders().set('Authorization', environment.token),
  }

  getAllTema(): Observable<Tema[]>{ //pede um aray
    //retorna um objeto http com um array de temas, passando o token como autenticação
    return this.http.get<Tema[]>('http://localhost:8080/tema', this.token) //mesmo endpoint do back
  }

  getByIdTema(id: number): Observable<Tema>{
    return this.http.get<Tema>(`http://localhost:8080/tema/${id}`, this.token)
  }

  postTema(tema: Tema): Observable<Tema>{ //recebe como parâmetro um tema que será passado no endpoint, junto com o token
    return this.http.post<Tema>('http://localhost:8080/tema', tema, this.token)
  }

  putTema(tema: Tema): Observable<Tema>{
    return this.http.put<Tema>('http://localhost:8080/tema', tema, this.token)
  }

  deleteTema(id: number){
    return this.http.delete(`http://localhost:8080/tema/${id}`, this.token)
  }


}
