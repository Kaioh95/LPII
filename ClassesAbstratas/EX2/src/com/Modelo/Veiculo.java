package com.Modelo;

/**
 * Classe que representa um veículo genérico.
 *
 * @author Kaio Henrique
 */
public class Veiculo {
    /**
     * Atributo armazena a quilometragem mensal
     */

    protected Integer kmMensais;
    /**
     * Método que retorna quilometragem mensal
     * @return kmMensais
     */
    public Integer getKmMensais() {
        return kmMensais;
    }

    /**
     * Método para setar kmMensais
     * @param kmMensais quilômetros
     */
    public void setKmMensais(Integer kmMensais) {
        this.kmMensais = kmMensais;
    }

    /**
     * Métdodo que faz cálculo do custo de litros mensais.
     * @return double
     */
    public double calculoDoCustoMensal(double litroPorKm){
        return this.kmMensais * litroPorKm;
    }
}
