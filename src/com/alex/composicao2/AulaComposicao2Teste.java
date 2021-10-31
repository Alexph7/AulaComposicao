package com.alex.composicao2;

import com.alex.composicao2.ComissaoEmpregadoComp;
import com.alex.composicao2.SalarioBaseEComissaoEmpregado;

public class AulaComposicao2Teste {

        public static void main(String[] args) {

                ComissaoEmpregadoComp empreg = new ComissaoEmpregadoComp("Alex", "Souza", 123.3, .6);
                SalarioBaseEComissaoEmpregado emp = new SalarioBaseEComissaoEmpregado(empreg, 220);
                
                System.out.println(empreg.ganhosComissao());
        }
        
}
