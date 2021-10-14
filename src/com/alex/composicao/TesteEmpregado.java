package com.alex.composicao;

public class TesteEmpregado {

        public static void main(String[] args) {
                Data aniversario = new Data(11, 01, 1994);
                Data contratacao = new Data(05, 07, 2012);
                Empregado empregado = new Empregado("Alex", "Souza", aniversario, contratacao);
                System.out.printf("%s %n", aniversario);
                
                
        }
        
}
