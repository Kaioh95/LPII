package com.Visual;

import com.Modelo.Carro;
import com.Modelo.Moto;
import com.Modelo.Taxi;
import com.Modelo.Veiculo;

import java.util.ArrayList;

/**
 * Classe main
 * @author Kaio Henrique
 */
public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMotor(2.0);
        carro1.setKmMensais(500);

        Carro carro2 = new Carro();
        carro2.setMotor(0.9);
        carro2.setKmMensais(500);

        Moto moto1 = new Moto();
        moto1.setCilindrada(800);
        moto1.setKmMensais(600);

        Moto moto2 = new Moto();
        moto2.setCilindrada(100);
        moto2.setKmMensais(600);

        Taxi taxi1 = new Taxi();
        taxi1.setQuantidadeDePessoas(3);
        taxi1.setKmMensais(1000);

        Taxi taxi2 = new Taxi();
        taxi2.setKmMensais(1000);

        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(moto1);
        veiculos.add(moto2);
        veiculos.add(taxi1);
        veiculos.add(taxi2);

        for(Veiculo veiculo: veiculos){
            if(veiculo instanceof Carro){
                System.out.println("-------------------------------");
                System.out.println("Carbon Foot Print do Carro: " + ((Carro) veiculo).getCarbonFootPrint());
            }
            else if(veiculo instanceof Moto){
                System.out.println("-------------------------------");
                System.out.println("Carbon Foot Print da Moto: " + ((Moto) veiculo).getCarbonFootPrint());
            }
            else if(veiculo instanceof Taxi){
                System.out.println("-------------------------------");
                System.out.println("Carbon Foot Print do Taxi: " + ((Taxi) veiculo).getCarbonFootPrint());
            }

        }
    }
}
