/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mariani.modelo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public abstract class Animal {

    private Especie especie;
    private String nome;
    private double peso;
    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat dF = new DecimalFormat("0.##");

    public Animal(Especie especie) {
        this.especie=especie;
    }

    public Animal(Especie especie, String nome, double peso) {
        this.especie = especie;
        this.nome = nome;
        this.peso = peso;
    }


    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
 }
