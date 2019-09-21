package com.Modelo;

/**
 * Classe abstrata
 * @author Kaio Henrique
 */
public abstract class PessoaIMC extends Pessoa{
    /**
     * Atributo que armazena peso
     */
    protected double peso;
    /**
     * Atributo que armazena altura
     */
    protected double altura;

    /**
     * Método que retorna peso
     * @return peso - Massa corporal
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método para setar peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método que retorna altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método para setar altura
     * @param altura medida em metros
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaIMC(double altura, double peso){
        return peso/(altura*altura);
    }
    /**
     * Método abstrato
     * @return String
     */
    public abstract String resultIMC();

    /**
     * Override de toString
     * @return String
     */
    public String toString(){
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
