/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberadditionmvc.model;

/**
 *
 * @author Sergio Garcia Prado
 */
public class Numero {
    
    private double mNumero;
    
    /**
     * Constructor por defecto de Numero.
     */
    public Numero(){
    }
    
    
    /**
     * Constructor de Numero que a la vez fija el valor de mNumero.
     * @param numero 
     */
    public Numero(double numero){
        this.mNumero = numero;
    }
    
    /**
     * Setter de Numero
     * @param numero 
     */
    public void setNumero(double numero){
        this.mNumero = numero;
    }
    
    /**
     * Getter de Numero.
     * @return double.
     */
    public double getNumero(){
        return mNumero;
    }
    
    /**
     * Metodo toString.
     * @return Valor del numero.
     */
    @Override
    public String toString(){
        return String.valueOf(mNumero);
    }
    
    /**
     * Funcion que suma dos numeros.
     * @param num1 Primer Numero a sumar.
     * @param num2 Segundo Numero a sumar.
     * @return Nuevo Numero con el valor de la suma de los parametros de la funcion.
     */
    public static Numero sumaNumero(Numero num1, Numero num2){
        double result = num1.getNumero() + num2.getNumero();
        return new Numero(result);
    }
}
