/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author David Campos Rodríguez <david.campos@rai.usc.es>
 */
public class ObjetoNoEquipableException extends ObjetoException{

    public ObjetoNoEquipableException() {
    }

    public ObjetoNoEquipableException(String message) {
        super(message);
    }
    
}