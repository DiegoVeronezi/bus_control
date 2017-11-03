import br.com.diegoveronezi.buscontrol.OnibusDAO;
import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;

public class OnibusDAOTeste {

    private OnibusDAO onibusDAO = new OnibusDAO();


    @Test
    public void testaGetHorarioTabelaFatima(){
        Time time = Time.valueOf("14:00:00");
        Time esperado = Time.valueOf("14:30:00");
        Time resultado = onibusDAO.getHorarioTabela(time,1).get(0);
        assertEquals(esperado,resultado);
    }


    @Test
    public void testaGetHorarioTabelaFlorida(){
        Time time = Time.valueOf("15:00:00");
        Time esperado = Time.valueOf("15:20:00");
        Time resultado = onibusDAO.getHorarioTabela(time,2).get(0);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testaGetHorarioTabelaColina(){
        Time time = Time.valueOf("16:00:00");
        Time esperado = Time.valueOf("16:10:00");
        Time resultado = onibusDAO.getHorarioTabela(time,3).get(0);
        assertEquals(esperado,resultado);
    }

    //tentar colocar um horario que vá falhar ex: 23:59

}
