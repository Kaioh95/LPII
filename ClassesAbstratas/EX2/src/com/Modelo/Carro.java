package com.Modelo;

import com.Controle.CarbonFootPrint;

/**
 * Classe que representa um Veiculo do tipo Carro
 *
 * @author Kaio Henrique
 */
public class Carro extends Veiculo implements CarbonFootPrint {
    /**
     * Atributo que armazena potência do motor
     */
    protected double motor;

    /**
     * Método que retorna motor
     * @return motor
     */
    public double getMotor() {
        return motor;
    }

    /**
     * Método para setar motor
     * @param motor
     */
    public void setMotor(double motor) {
        this.motor = motor;
    }

    /**
     * Método que retorna o cáculo do CarbonFootPrint de Carro
     * @return CarbonFootPrint
     */
    @Override
    public double getCarbonFootPrint() {
        if (motor >= 2.0)
            return getKmMensais()*1.85;
        else if (motor <= 1.0)
            return getKmMensais()*0.13;
        else
            return getKmMensais()*1.10;
    }
}
