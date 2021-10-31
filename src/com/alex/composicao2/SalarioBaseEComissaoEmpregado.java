package com.alex.composicao2;

public class SalarioBaseEComissaoEmpregado {

        private ComissaoEmpregadoComp empregado;
        private double salarioBase;

        public SalarioBaseEComissaoEmpregado(ComissaoEmpregadoComp empregado, double salarioBase) {
                this.empregado = empregado;
                this.salarioBase = salarioBase;
        }

        public ComissaoEmpregadoComp getEmpregado() {
                return empregado;
        }

        public void setEmpregado(ComissaoEmpregadoComp empregado) {
                this.empregado = empregado;
        }

        public double getSalarioBase() {
                return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
                this.salarioBase = salarioBase;
        }
        
        public double ganhosComissao() {
                return getEmpregado().ganhosComissao()+ getSalarioBase();
        }

        @Override
        public String toString() {
                return empregado + "\nsalario Base " + salarioBase + "\nLucros: "+
                           ganhosComissao() ;
        }
        
        
        
}
