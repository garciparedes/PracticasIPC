/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JFrame;
import model.User;
import view.home.Home;
import view.login.Login;

/**
 *
 * @author garciparedes
 */
public class Main {
    
    private static Login loginStateMachine; 
    private static Home homeStateMachine;
    
    private static ArrayList<User> mUsersList;
    
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
        mUsersList= new ArrayList<User>();
        mUsersList.add(new User("nombre", "contraseña", "Pepito"));
        
        loginStateMachine = new Login();
    }
    public static Login getStateMachineLogin() {
        return loginStateMachine; 
    }
    
    public static void loginSucceed() { 
        loginStateMachine.close(); 
        homeStateMachine = new Home();
    }
    
    public static Home getStateMachineHome() {
        return homeStateMachine; 
    }
}
