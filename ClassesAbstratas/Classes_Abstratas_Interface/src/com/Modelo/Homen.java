package com.Modelo;

/**
 * Classe que representa pessoa do sexo Masculino
 * @author Kaio Henrique
 */

public class Homen extends PessoaIMC{
    /**
     * Método que implenta a classe abstrata resultIMC
     */
    public String resultIMC(){
        double imc = calculaIMC(altura, peso);
        if(imc < 20.7){
            return "IMC: " + String.format("%.2f", imc) + " - Abaixo do peso ideal";
        }
        else if((imc >= 20.7) && (imc < 26.4)){
            return "IMC: " + String.format("%.2f", imc) + " - Peso ideal";
        }
        else{
            return "IMC: " + imc + " - Acima do peso ideal";
        }
    }
}
