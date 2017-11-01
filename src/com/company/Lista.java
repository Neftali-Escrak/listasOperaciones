package com.company;

/**
 * Created by Chovibys on 24/10/2017.
 */
public class Lista {
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Nodo inicio;

    private int tamaño;

    public void Lista() {
        inicio = null;
        tamaño = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void agregarAlFinal(int valor) {
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamaño++;
    }

    public  int getPosicion(int referencia) {


        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {

            // Crea una copia de la lista.
            Nodo aux = inicio;
            // COntado para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            System.out.print("el valor buscado esta en el índice: ");
            while (referencia != aux.getValor()) {
                // Incrementa el contador.
                cont++;
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();

            }
            // Retorna el valor del contador.
            return (cont);
            // Crea una excepción de Valor inexistente en la lista.
        } else {

                System.out.println("Valor inexistente en la lista.");
                return (0);
            }
        }







    public void removerPorPosicion(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamaño){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSiguiente();
            }
            // En caso que el nodo a eliminar este por el medio
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                Nodo siguiente = aux.getSiguiente();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setSiguiente(siguiente.getSiguiente());
            }
            // Disminuye el contador de tamaño de la lista.
            tamaño--;

        }
    }

    public boolean buscar(int referencia) {
        if (tamaño == 0) {
            System.out.println("la lista esta vacia");
        } else {

            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Bandera para indicar si el valor existe.
            boolean encontrado = false;
            // Recorre la lista hasta encontrar el elemento o hasta
            // llegar al final de la lista.
            while (aux != null && encontrado != true) {
                // Consulta si el valor del nodo es igual al de referencia.
                if (referencia == aux.getValor()) {
                    // Canbia el valor de la bandera.
                    encontrado = true;
                } else {
                    // Avansa al siguiente. nodo.
                    aux = aux.getSiguiente();
                }
            }
            // Retorna el resultado de la bandera.
            return encontrado;
        }
    return false;
    }


    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
            }else{
            System.out.println("la lista está vacia ingresa valores para realizar la operación que decees");
        }
    }



}

