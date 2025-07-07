/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanita;

/**
 *
 * @author Luis
 */
public class Ventanita {

    public static void main(String[] args) {
        
        //Inicia la aplicacion con la ventana de login
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
            
        });
                
    }
}
