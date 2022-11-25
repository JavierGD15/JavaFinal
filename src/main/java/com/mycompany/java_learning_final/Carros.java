/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_learning_final;

public class Carros {

    int matricula;
    String modelo;
    String marca;

    public Carros(int matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {

        System.out.println("El carro se enciende");
    }

    public void frenar() {

        System.out.println("EL carro esta frenando");

    }

}
