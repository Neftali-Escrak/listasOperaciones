package com.company;

/**
 * Created by Chovibys on 24/10/2017.
 */
public class Nodo {

    private int valor;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
