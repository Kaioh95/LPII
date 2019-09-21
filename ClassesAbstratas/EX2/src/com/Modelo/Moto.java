package com.Modelo;

import com.Controle.CarbonFootPrint;

/**
 * Classe que representa um Veívulo do tipo Moto
 * @author Kaio Henrique
 */
public class Moto extends Veiculo implements CarbonFootPrint {
    /**
     * Atributo que armazena cilindrada
     */
    protected int cilindrada;

    /**
     * Método que retorna cilindrada
     * @return cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Método para setar cilindrada
     * @param cilindrada
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Método que retorna o cáculo do CarbonFootPrint de Moto
     * @return CarbonFootPrint
     */
    @Override
    public double getCarbonFootPrint() {
        if (cilindrada >= 650)
            return getKmMensais()*0.65;
        else if (cilindrada <= 150)
            return getKmMensais()*0.2;
        else
            return getKmMensais()*0.5;
    }
}
