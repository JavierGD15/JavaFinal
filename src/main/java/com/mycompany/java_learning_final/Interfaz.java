/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.java_learning_final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author javie
 */
public class Interfaz extends JFrame {

    JTextField t1 = new JTextField();
    JPasswordField t2 = new JPasswordField();

    public void iniciar() {
        //cierra por medio de la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350, 300);
        setVisible(true);
        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setLayout(null);
        add(p1);
        //Label
        JLabel l1 = new JLabel("Usuario:");
        l1.setSize(70, 30);
        l1.setLocation(30, 60);
        p1.add(l1);
        //TextFiel
        t1.setSize(150, 35);
        t1.setLocation(130, 60);
        p1.add(t1);

        //Label
        JLabel l2 = new JLabel("Password:");
        l2.setSize(70, 30);
        l2.setLocation(30, 120);
        p1.add(l2);
        //TextFiel
        t2.setSize(150, 35);
        t2.setLocation(130, 120);
        p1.add(t2);

        //button
        JButton b1 = new JButton("Enviar");
        b1.setSize(70, 30);
        b1.setLocation(120, 180);
        p1.add(b1);

        ActionListener enviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("admin".equals(t1.getText()) && "patito123".equals(t2.getText())) {
                  JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                  administrador ad = new administrador();
                  ad.iniciar();
                  dispose();
                } else {
                   JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                }
            }

        };

        b1.addActionListener(enviar);

    }

    public static void main(String[] args) {
        Interfaz s = new Interfaz();
        s.iniciar();
    }
}
