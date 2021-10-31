package com.alex.composicao2;

public class ComissaoEmpregadoComp {

        private final String nome;
        private final String sobreNome;
        private double vendaBruta;
        private double taxaDeComissao;

        public ComissaoEmpregadoComp(String nome, String sobreNome, double vendaBruta, double taxaDeComissao) {

                if (vendaBruta < 0) {
                        throw new IllegalArgumentException("Vendas Deve Ser Maior ou igual a Zero");
                }

                if (taxaDeComissao < 0 || taxaDeComissao > 1) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser entre 0.0 e 1.0");
                }
                this.nome = nome;
                this.sobreNome = sobreNome;
                this.vendaBruta = vendaBruta;
                this.taxaDeComissao = taxaDeComissao;
        }

        public String getNome() {
                return nome;
        }

        public String getSobreNome() {
                return sobreNome;
        }

        public double getVendaBruta() {
                return vendaBruta;
        }

        public void setVendaBruta(double vendaBruta) {
                this.vendaBruta = vendaBruta;
        }

        public double getTaxaDeComissao() {
                return taxaDeComissao;
        }

        public void setTaxaDeComissao(double taxaDeComissao) {
                this.taxaDeComissao = taxaDeComissao;
        }

        public double ganhosComissao() {
                return getVendaBruta() * getTaxaDeComissao();
        }

        @Override
        public String toString() {
                return String.format("%s%s%s %n%s%.2f %n%s%.2f",
                            "Empregado: ", getNome() , getSobreNome(),
                             "Venda Bruta: ", getVendaBruta(),
                             "Taxa De Comissão: ", getTaxaDeComissao());
        }
}
