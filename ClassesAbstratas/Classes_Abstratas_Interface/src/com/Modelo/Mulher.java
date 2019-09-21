package com.Modelo;

/**
 * Classe que representa pessoa do sexo Feminino
 * @author Kaio Henrique
 */
public class Mulher extends PessoaIMC{
    /**
     * Método que implenta a classe abstrata resultIMC
     */
    public String resultIMC(){
        double imc = calculaIMC(altura, peso);
        if(imc < 19){
            return "IMC: " + String.format("%.2f", imc) + " - Abaixo do peso ideal";
        }
        else if((imc >= 19) && (imc < 25.8)){
            return "IMC: " + String.format("%.2f", imc)  + " - Peso ideal";
        }
        else{
            return "IMC: " + String.format("%.2f", imc)  + " - Acima do peso ideal";
        }
    }
}
