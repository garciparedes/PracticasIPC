/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter.vista;

import tempconverter.modelo.ModeloTempConverter;

/**
 *
 * @author garciparedes
 */
public class ControladorTempConverter {
    
    private VistaTempConverter mVista;
    private ModeloTempConverter mModelo;
    
    public ControladorTempConverter(VistaTempConverter vista, ModeloTempConverter modelo){
        this.mVista = vista;
        this.mModelo = modelo;
    }
    
    public void convert(){
        double celsius = mVista.getCelsius();
        // almacenar celsius en el modelo
        mModelo.setCelsius(celsius);
        //convierte celsius en el modelo
        double fahrenheit = mModelo.celsiusToFahrenheit(celsius);
        //almacena fahrenheit en el modelo
        mModelo.setFahrenheit(fahrenheit);
        //Actualizamos la vista
        mVista.updateFahrenheit();
    }
    
    public void exit(){
        System.exit(0);
    }
    
}
