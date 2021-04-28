import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from '../model/Usuario';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {

  usuario: Usuario = new Usuario; //instanciando objeto
  confirmarSenha: string;
  tipoUser:string;

  constructor( //injeção de dependências
    private authService: AuthService,
    private router: Router
  ) { }

  ngOnInit() {
    window.scroll(0, 0)
  }

  confirmSenha(event: any){
    this.confirmarSenha= event.target.value;
  }

  tipoUsuario(event:any){
    this.tipoUser = event.target.value;
  }

  cadastrar(){
    this.usuario.tipo = this.tipoUser;

    if(this.usuario.senha != this.confirmarSenha){
      alert('As senhas estão incorretas.')
    }else{
      this.authService.cadastrar(this.usuario).subscribe((resp:Usuario)=>{
        this.usuario = resp;
        this.router.navigate(['/entrar']) //configurando rota após cadastro com sucesso
        alert('Usuário cadastrado com sucesso!')
      })
    }
  }

}
