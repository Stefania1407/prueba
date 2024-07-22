package colecciones.genericas;

public class ListaEnlazadaG <Tipo>{

    private int tamaño;
    private Nodo<Tipo> cabeza;

    public ListaEnlazadaG(){

        this.tamaño = 0;
        this.cabeza = null;

    }

    public void agregar (Tipo elemento){
        Nodo<Tipo> nuevoNodo = new Nodo<>(elemento, null);

        if(this.cabeza == null){
            this.cabeza = nuevoNodo;

        }else{

            Nodo<Tipo> nodoActual = cabeza;

            while (nodoActual.getSiguiente() != null){
                nodoActual = cabeza.getSiguiente();
            }

            nodoActual.setSiguiente(nuevoNodo);
        }
        this.tamaño ++ ;
    }

    public void imprimirContenido(){
        Nodo<Tipo> nodoActual = this.cabeza;

        if(this.cabeza == null){
            return;
        }
        while (nodoActual.getSiguiente()!= null){

            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }

        System.out.println(nodoActual.getDato());
    }
}
