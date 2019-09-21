package com.Visual;

import com.Modelo.Homen;
import com.Modelo.Mulher;
import com.Modelo.Pessoa;
import com.Modelo.PessoaIMC;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Homen homen1 = new Homen();
        homen1.setNome("Zé Lezin");
        Date nascimento1 = new Date("20/01/1945");
        homen1.setDataNascimento(nascimento1);
        homen1.setPeso(74.8);
        homen1.setAltura(1.75);

        Mulher mulher1 = new Mulher();
        mulher1.setNome("Frida Kahlo");
        Date nascimento2 = new Date("06/07/1907");
        mulher1.setDataNascimento(nascimento2);
        mulher1.setPeso(50.2);
        mulher1.setAltura(1.69);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(homen1);
        pessoas.add(mulher1);

        for(Pessoa pessoa: pessoas){
            System.out.println("-------------------------------------------------");
            System.out.println(pessoa.toString());
            System.out.println(((PessoaIMC) pessoa).resultIMC());
        }
    }
}
