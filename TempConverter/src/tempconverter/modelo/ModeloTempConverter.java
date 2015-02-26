/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter.modelo;

/**
 *
 * @author garciparedes
 */
public class ModeloTempConverter {
    
    private double mCelsius;
    private double mFahrenheit;
    
    
    public ModeloTempConverter(){
        this.mCelsius = 0;
        this.mFahrenheit = 32;
        
    }
    
    public void setCelsius(double celsius){
        this.mCelsius = celsius;
    }
    
    public void setFahrenheit(double fahrenheit){
        this.mFahrenheit = fahrenheit;
    }
    
    public double getCelsius(){
        return mCelsius;
    }
    
    public double getFahrenheit(){
        return mFahrenheit;
    }
    
    public double celsiusToFahrenheit(double celsius){
        return (celsius * (9/5)) +32;
    }
    
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) * (5/9);
    }
}
