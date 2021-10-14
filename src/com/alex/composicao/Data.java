package com.alex.composicao;

public class Data {

        private int dia; //0-31
        private int mes; //0-12
        private int ano; //qualquer ano
        private final int[] diaDoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public Data(int dia, int mes, int ano) {

                if (dia <= 0 || (dia > diaDoMes[mes] && !(mes == 2 && dia == 29))) {
                        throw new IllegalArgumentException("Dia invalido para este mês");
                }
                if (mes <= 0 || mes >12 ) {
                        throw new IllegalArgumentException("Mes Invalido, Deve ser 1-12");
                }

                if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 == 0))) {
                        throw new IllegalArgumentException("Dia fora da data para este mes do ano.");
                }
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
                
        }

        public String toString() {
                return String.format("%d/%d/%d", dia, mes, ano);
        }
}