/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendacontacto;
import Vista.*;
/**
 *
 * @author USUARIO
 */
public class AgendaContacto {
  public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                VistaAgenda Vista = new VistaAgenda();
                
              
                Vista.setLocationRelativeTo(null);
                
             
                Vista.setVisible(true);
            }
        });
    }
}
