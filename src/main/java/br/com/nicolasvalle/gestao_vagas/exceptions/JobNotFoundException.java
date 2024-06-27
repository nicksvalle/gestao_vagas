package br.com.nicolasvalle.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException{
    public JobNotFoundException(){
        super("Usuário já existe");
    }
    
}
