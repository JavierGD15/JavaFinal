/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_learning_final;

/**
 *
 * @author javie
 */
public class Hatchback extends Carros {
    int cilindraje;
    int largo;

    public Hatchback(int cilindraje, int largo, int matricula, String modelo, String marca) {
        super(matricula, modelo, marca);
        this.cilindraje = cilindraje;
        this.largo = largo;
    }
    
    public void mostrarDatos(){
        System.out.println("Matricula:" + matricula);
        System.out.println("Modelo:" + modelo);
        System.out.println("Marca:" + marca);
        encender();
        frenar();
    }
    
    public static void main(String[] args) {
        Carros c1 = new Carros(2111, "Echo", "Toyota");
        Hatchback carro = new Hatchback(2333, 3, 234, "Yaris", "Toyota");
    }
}
