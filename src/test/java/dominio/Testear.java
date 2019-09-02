package dominio;

        import org.junit.Before;
        import  org.junit.Test;

        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;

public class Testear{
    private Lista peron;
    private DateTimeFormatter formato_tiempo;



    @Before
    public void init(){

        this.peron = new Lista("peronia",1,Partido_Politico.PARTIDO_PARA_EL_COMANDANTE, LocalDate.parse("2019-08-29"),true);
        Lista manuela = new Lista("zurdos",2,Partido_Politico.FRENTE_DE_IZQUIERDA,LocalDate.parse("1997-03-13"),true);
    }
    @Test
    public void nuevaLista(){
        this.formato_tiempo = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(this.peron.fecha_de_conformacion.format(formato_tiempo));

    }

}
