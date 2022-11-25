package com.mycompany.java_learning_final;

public class Cuentas {

    int id;
    String nombre;
    float saldo = 200;
    String tipo;

    public Cuentas(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    

    public void mostrar() {

        System.out.println("El saldo es: " + this.saldo);

    }

    public void abonar(float dinero) {

        this.saldo += dinero;

    }

    public void debitar(float dinero) {

        this.saldo -= dinero;

    }

}
