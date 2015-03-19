/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import javax.swing.JFrame;

/**
 *
 * @author garciparedes
 */
public class Login {
    private JFrame currentState;
    
    public Login() {
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new LoginWindow(); 
                currentState.setVisible(true);
            } 
        });
    } 

    
    public void recoverPassword() {
        currentState.setVisible(false); // si se desea ocultar 
        currentState.dispose(); // si se desea destruir  
            //realiza transición 
        java.awt.EventQueue.invokeLater(
            new Runnable() { public void run() {
                currentState = new PasswordRecoveryWindow();
                currentState.setVisible(true); 
            }
        });
    }

    public void close() {
        currentState.setVisible(false);
    }
    
    
}
