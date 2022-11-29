package com.mycompany.java_learning_final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class administrador extends JFrame {

    JTabbedPane barra = new JTabbedPane();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();

    Object datos[][] = new Object[4][50];
    int ingresos = 1;

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    public void iniciar() {
        //cierra por medio de la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 400);
        setVisible(true);

        p1.setLayout(null);
        p2.setLayout(null);
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.cyan);

        barra.addTab("Mostrar usuario", p1);
        barra.addTab("Crear usuario", p2);
        add(barra);

        tabla();
        usuarios();

    }

    public void tabla() {

        String columnas[] = {"No.", "Nombre", "direccion", "telefono"};
        tabla = new JTable(datos, columnas);
        sp = new JScrollPane(tabla);
        sp.setSize(450, 300);
        sp.setLocation(10, 10);
        p1.add(sp);
    }

    public void usuarios() {

        JLabel l1 = new JLabel("Nombre: ");
        l1.setBounds(20, 50, 100, 30);
        p2.add(l1);

        t1.setBounds(150, 50, 200, 30);
        p2.add(t1);

        JLabel l2 = new JLabel("Direccion: ");
        l2.setBounds(20, 120, 100, 30);
        p2.add(l2);

        t2.setBounds(150, 120, 200, 30);
        p2.add(t2);

        JLabel l3 = new JLabel("Telefono: ");
        l3.setBounds(20, 190, 100, 30);
        p2.add(l3);

        t3.setBounds(150, 190, 200, 30);
        p2.add(t3);

        JButton b1 = new JButton("Guardar");
        b1.setBounds(200, 280, 80, 30);

        ActionListener enviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty() || t2.getText().isEmpty()
                        || t3.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Rellenar todas las casillas");

                } else {

                    datos[ingresos - 1][0] = ingresos;
                    datos[ingresos - 1][1] = t1.getText();
                    datos[ingresos - 1][2] = t2.getText();
                    datos[ingresos - 1][3] = t3.getText();
                    ingresos++;
                    sp.setVisible(false);
                    tabla();
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);

                }
            }
        };

        b1.addActionListener(enviar);

        p2.add(b1);

    }

}
