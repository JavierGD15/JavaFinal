package com.mycompany.java_learning_final;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Learning_Final {

    ArrayList<Cuentas> Lista_cuentas = new ArrayList<>();
    int num = 1;

    public void ejecutar() {

        while (true) {
            Scanner sp = new Scanner(System.in);
            Scanner sp2 = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("| 1. Crear Cuenta               |");
            System.out.println("| 2. Mostrar Cuentas existentes |");
            System.out.println("| 3. Mostrar Saldo              |");
            System.out.println("| 4. Abonar Saldo               |");
            System.out.println("| 5. Debitar Saldo              |");
            System.out.println("| 6. Salir                      |");
            System.out.println("---------------------------------");
            switch (sp.nextInt()) {
                case 1:
                    System.out.println("Ingrese su nombre");
                    String nombre = sp2.nextLine();
                    System.out.println("Ingrese su tipo de cuenta");
                    String tipo = sp2.nextLine();
                    Lista_cuentas.add(new Cuentas(num,nombre, tipo));
                    num++;
                    break;
                case 2:
                    System.out.println("--------Cuentas existentes--------");
                    for (int i = 0; i < Lista_cuentas.size(); i++) {
                         System.out.println("| " + (i + 1) + ". ID: " + Lista_cuentas.get(i).id + " |");
                        System.out.println("| " + (i + 1) + ". Nombre: " + Lista_cuentas.get(i).nombre + " |");

                    }
                    System.out.println("--------FIN--------");
                    break;
                case 3:
                    System.out.println("--------Cuentas existentes--------");
                    for (int i = 0; i < Lista_cuentas.size(); i++) {
                        System.out.println("| " + (i + 1) + ". Saldos: " + Lista_cuentas.get(i).saldo + " |");

                    }
                    System.out.println("--------FIN--------");
                    break;
                case 4:
                    System.out.println("--------Abonar saldo-------");
                    System.out.println("| Ingrese el ID de cuenta |");
                    int id = sp.nextInt();
                    for (int i = 0; i < Lista_cuentas.size(); i++) {
                        if (Lista_cuentas.get(i).id == id) {
                            System.out.println("| Ingrese el valor a abonar |");
                            float dinero = sp.nextFloat();
                            Lista_cuentas.get(i).abonar(dinero);
                            break;
                        }

                    }
                    break;
                case 5:
                    System.out.println("--------Debitar saldo-------");
                    System.out.println("| Ingrese el ID de cuenta |");
                    id = sp.nextInt();
                    for (int i = 0; i < Lista_cuentas.size(); i++) {
                        if (Lista_cuentas.get(i).id == id) {
                            System.out.println("| Ingrese el valor a debitar |");
                            float dinero = sp.nextFloat();
                            Lista_cuentas.get(i).debitar(dinero);
                            break;
                        }

                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static void main(String[] args) {
        Java_Learning_Final idea = new Java_Learning_Final();
        idea.ejecutar();
    }
}
