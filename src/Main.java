import colecciones.genericas.ListaEnlazadaG;
import colecciones.simples.ListaEnlazadaSimple;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("-----Lista generica-------");

        ListaEnlazadaG<String> ciudades = new ListaEnlazadaG<>();
        ciudades.agregar("Cartagena");
        ciudades.agregar("Armenia");
        ciudades.agregar("Cali");

        ciudades.imprimirContenido();

        System.out.println("------Lista no generica----");

        ListaEnlazadaSimple ciudades2 = new ListaEnlazadaSimple();
        ciudades2.agregar("Medellin");
        ciudades2.agregar("Pereira");


        ciudades2.imprimirContenido();

    }
}