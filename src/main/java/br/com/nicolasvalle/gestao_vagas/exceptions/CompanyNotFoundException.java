package br.com.nicolasvalle.gestao_vagas.exceptions;

public class CompanyNotFoundException extends RuntimeException{
    public CompanyNotFoundException() {
        super("Company not fould");
    }
}
