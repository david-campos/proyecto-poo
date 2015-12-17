/*
 * 
 */
package Comandos;

import Excepciones.ComandoExcepcion;
import Excepciones.ObjetoNoEncontradoException;
import Excepciones.ObjetoNoUsableException;
import Excepciones.PersonajeException;
import Personajes.Jugador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Campos Rodríguez <david.campos@rai.usc.es>
 */
public final class ComandoUsar implements Comando{
    private Jugador jug;
    private String nombre;
    public ComandoUsar(Jugador jug, String nombre){
        this.jug = jug;
        this.nombre = nombre;
    }

    public Jugador getJugador() {
        return jug;
    }

    public void setJugador(Jugador jug) {
        this.jug = jug;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void ejecutar() throws ComandoExcepcion {
        if(jug!=null)
            if(nombre != null && !nombre.isEmpty()){
                try {
                    jug.usar(nombre);
                } catch (ObjetoNoUsableException | ObjetoNoEncontradoException ex) {
                    throw new ComandoExcepcion(ex.getMessage());
                }
            }else
                throw new ComandoExcepcion("No se ha indicado el nombre del objeto a usar...");
    }
    
}
