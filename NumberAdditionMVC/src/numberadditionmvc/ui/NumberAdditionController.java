/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberadditionmvc.ui;

import numberadditionmvc.model.Numero;

/**
 *
 * @author Sergio Garcia Prado
 */
public class NumberAdditionController {
    
    private Numero mNum1;
    private Numero mNum2;
    private Numero mResult;
    
    private NumberAdditionUI mNumberAdditionUI;
    
    /**
     * Constructor de la clase.
     * @param numberAdditionUI 
     */
    public NumberAdditionController(NumberAdditionUI numberAdditionUI){
        this.mNumberAdditionUI = numberAdditionUI;
        this.mNum1 = new Numero();
        this.mNum2 = new Numero();
    }
    
    /**
     * Metodo que suma dos numeros y los muestra en la vista
     */
    public void sum(){
        
        //Obtenemos el valor del numero 1.
        mNum1.setNumero(Double.parseDouble(
                mNumberAdditionUI.getTextFieldNumberOne())
        );
        
        //Obtenemos el valor del numero 2.
        mNum2.setNumero(Double.parseDouble(
                mNumberAdditionUI.getTextFieldNumberTwo())
        );
        
        //Sumamos los dos numeros.
        mResult = Numero.sumaNumero(mNum1, mNum2);
        
        //Enviamos el resultado a la vista.
        mNumberAdditionUI.setTextFieldNumberResult(mResult.toString());
    }
    
    /**
     * Metodo que vacia el contenido de los distintos casilleros.
     */
    public void clear(){
        mNumberAdditionUI.setTextFieldNumberOne(null);
        mNumberAdditionUI.setTextFieldNumberTwo(null);
        mNumberAdditionUI.setTextFieldNumberResult(null);

    }
    
    /**
     * Metodo que cierra la aplicacion
     */
    public void exit(){
        System.exit(0);
    }
    
}
