/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author garciparedes
 */
public class User {
    
    
    private String mUsername;
    private String mPassword;
            
    private String mName;
    
    public User(String username, String password, String name){
        this.mUsername = username;
        this.mPassword = password;
        this.mName = name;
    }

}
