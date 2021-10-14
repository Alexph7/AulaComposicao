package com.alex.composicao;

public class Empregado {

        String nome;
        String sobreNome;
        Data aniversario;
        Data dataContratacao;

        public Empregado(String nome, String sobreNome, Data aniversario, Data dataContratacao) {
                this.nome = nome;
                this.sobreNome = sobreNome;
                this.aniversario = aniversario;
                this.dataContratacao = dataContratacao;
        }

        public String toString() {
                return String.format("Nome: %s %s, %nData Aniversario: %s %nData de Contratação: %s", nome, sobreNome, aniversario, dataContratacao);
        }
        
}
