package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum Partido_Politico{
    PARTIDO_PARA_EL_COMANDANTE,
    PARTIDO_PARA_EL_FUHRER,
    FRENTE_DE_IZQUIERDA,
    IZQUIERDA_AL_FRENTE
}


public class Lista {
    protected String nombre_lista;
    protected int   numero_lista;
    protected Partido_Politico partido_politico;
    protected LocalDate fecha_de_conformacion;
    protected boolean vigencia;
    private List<Postulante> lista_postulante;


    public Lista(String nombre_lista, int numero_lista, Partido_Politico partido_politico, LocalDate fecha_de_conformacion, boolean vigencia){
        this.nombre_lista = nombre_lista;
        this.numero_lista = numero_lista;
        this.partido_politico = partido_politico;

        this.fecha_de_conformacion = fecha_de_conformacion;
        this.vigencia = vigencia;
        this.lista_postulante = new ArrayList<>();

}


    public void agregarFecha(){
        //this.fecha_de_conformacion = LocalDate.parse(18)


        // create a LocalDate object
        LocalDate date = LocalDate.parse("2018-11-13");

        // print instance
        System.out.println("LocalDate before"
                + " adding months: " + date);

        // add 5 months
        LocalDate returnvalue
                = date.plusMonths(5);

        // print result
        System.out.println("LocalDate after "
                + " adding months: " + returnvalue);
    }
    private void agregarPostulante(Postulante postulante){
        this.lista_postulante.add(postulante);
    }
    public int cuantosIntegrantesTiene(){
        return this.lista_postulante.size();
    }

    public void recuperarVigencia(Lista lista){
        if(lista.vigencia = false){
            lista.vigencia = true;
        }
        else{
            System.out.println("Ya es vigente");
        }
    }



}