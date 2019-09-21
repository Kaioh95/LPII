package com.Modelo;

import com.Controle.CarbonFootPrint;

/**
 * Classe que representa Veículo do tipo Taxi
 * @author Kaio Henrique
 */
public class Taxi extends Veiculo implements CarbonFootPrint {
    /**
     * Atributo que informa quantidade de pessoas no taxi
     */
    protected int quantidadeDePessoas;

    /**
     * Método que retorn quantidadeDePessoas
     * @return quantidadeDePessoas
     */
    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    /**
     * Método para setar quantidadeDePessoas
     * @param quantidadeDePessoas
     */
    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    /**
     * Método que retorna o cáculo do CarbonFootPrint de Taxi
     * @return CarbonFootPrint
     */
    @Override
    public double getCarbonFootPrint() {
        return getKmMensais()*1.1;
    }
}
