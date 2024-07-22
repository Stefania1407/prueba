package colecciones.simples;

import colecciones.genericas.ListaEnlazadaG;

public class ListaEnlazadaSimple {

    private int tamaño;
    private Nodo cabeza;

    public ListaEnlazadaSimple(){
        this.tamaño = 0;
        this.cabeza = null;

    }
    public void agregar(String elemento){
        Nodo nuevoNodo = new Nodo(elemento);

        if(this.cabeza == null){
            this.cabeza = nuevoNodo;

        }else{

            Nodo nodoActual = this.cabeza;

            while (nodoActual.getSiguiente()!= null){
                nodoActual = nodoActual.getSiguiente();

            }
            nodoActual.setSiguiente(nuevoNodo);
        }

        tamaño++;

    }

    public void imprimirContenido(){
        if(this.cabeza == null){
            return;

        }
        Nodo nodoActual = this.cabeza;
        while(nodoActual.getSiguiente()!= null){
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }

        System.out.println(nodoActual.getDato());
    }

}
