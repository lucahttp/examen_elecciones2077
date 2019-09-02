package dominio;

enum Cargo {
        PRESIDENTE,
        VICEPRESIDENTE,
        GOBERNADOR,
        DIPUTADO,
        SENADOR
        }

public class Postulante {

    protected String nombre_postulante;

    protected String apellido_postulante;

    protected Cargo cargo_postulante;

    Postulante(String nombre, String apellido, Cargo cargo){
        this.nombre_postulante =   nombre;
        this.apellido_postulante = apellido;
        this.cargo_postulante  =   cargo;
    }

}
