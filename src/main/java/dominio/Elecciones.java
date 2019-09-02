package dominio;

import java.util.ArrayList;
import java.util.List;

public class Elecciones {
    private List<Lista> lista_listas;
    private int añoElecciones;


    public Elecciones(int añoElecciones){
        this.añoElecciones = añoElecciones;
        this.lista_listas = new ArrayList<>();
    }


    private void agregarListaALasElecciones(Lista lista){
        if(lista.vigencia = true){
            this.lista_listas.add(lista);
        }
        else {
            System.out.println("esta lista no esta vigente");
        }
    }
}
