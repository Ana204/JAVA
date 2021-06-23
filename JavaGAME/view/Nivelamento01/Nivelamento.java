package view.Nivelamento01;

import model.NivelamentoPOO1.Pessoa;

public class Nivelamento {
     
    public static void main(String[] args) {
        
        Pessoa obj = new Pessoa();

        obj.setNome("Ana");
        obj.setTelefone("9999999");
        obj.setEmail("Ana@hotmail.com");

        System.out.println("Nome: " + obj.getNome());
        System.out.println("Telefone: " + obj.getTelefone());
        System.out.println("Email: " + obj.getEmail());
    }
}
