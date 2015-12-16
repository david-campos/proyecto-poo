/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 * Interfaz para implementar la consola
 * @author crist
 */
public interface Consola {
    /**
     * Imprime de la forma que se requiera el mensaje
     * @param mensaje mensaje a mostrar
     */
    public void imprimirMapa(String mensaje);

    /**
     *
     * @param mensaje
     */
    public void imprimir (String mensaje);

    /**
     *
     * @param mensaje
     */
    public void imprimirSinSalto(String mensaje);
    /**
     * Sirve para conseguir datos del usuario
     * @param descripcion Texto a mostrar previo a la introducción de los datos
     * @return Cadena introducida por el usuario.
     */
    public String leer (String descripcion);  

    /**
     *
     * @return
     */
    public String leer();

    /**
     *
     * @return
     */
    public boolean esGrafica();
}
