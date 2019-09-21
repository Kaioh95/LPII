package com.Modelo;

import java.util.Date;

/**
 * Classe que representa a entidade Pessoa
 *
 * @author Kaio Henrique
 */
public class Pessoa {
    /**
     * Atributo que armazena nome de uma pessoa
     */
    protected String nome;
    /**
     * Atributo que armazena data de nascimento de uma pessoa
     */
    protected Date dataNascimento;

    /**
     * Método que retorna nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para setar nome
     * @param nome Tipo string
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna data de nascimento
     * @return dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Método para setar data de nascimento
     * @param dataNascimento Tipo Date
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método que retorna uma String, listando atributos da classe
     */
    public String toString(){
        return "Nome: " + this.nome + "\nData de Nascimento: " + this.dataNascimento;
    }
}
