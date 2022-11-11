package com.mycompany.java_learning_final;

import java.util.Scanner;

public class Java_Learning_Final {

    public static void main(String[] args) {
        
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su radio");
        
        float radio  = sp.nextFloat();
        
        System.out.println("El area es: "
        +(Math.PI *Math.pow(radio,2)));
        
        System.out.println("Longitud de circunferencia es: "
                +(2*Math.PI*radio));
        
        
    }
}
