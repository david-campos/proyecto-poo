/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author crist
 */
public class ObjetoException extends Exception {
    
    /**
     *
     */
    public ObjetoException() {        
    }

    /**
     *
     * @param string
     */
    public ObjetoException(String string) {
        super(string);
    }
    
}
