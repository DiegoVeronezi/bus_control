import br.com.diegoveronezi.buscontrol.OnibusDAO;
import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;

public class OnibusDAOTeste {

    private OnibusDAO onibusDAO = new OnibusDAO();


    @Test
    public void testaGetHorarioTabelaFatimaPoa(){
        Time time = Time.valueOf("14:00:00");
        Time esperado = Time.valueOf("14:30:00");
        Time resultado = onibusDAO.getHorarioTabela(time,1).get(0);
        assertEquals(esperado,resultado);
    }


    @Test
    public void testaGetHorarioTabelaFloridaPoa(){
        Time time = Time.valueOf("15:00:00");
        Time esperado = Time.valueOf("15:20:00");
        Time resultado = onibusDAO.getHorarioTabela(time,2).get(0);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testaGetHorarioTabelaColinaPoa(){
        Time time = Time.valueOf("16:00:00");
        Time esperado = Time.valueOf("16:10:00");
        Time resultado = onibusDAO.getHorarioTabela(time,3).get(0);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testaGetHorarioTabelaFatimaGua(){
        Time time = Time.valueOf("18:10:00");
        Time esperado = Time.valueOf("18:45:00");
        Time resultado = onibusDAO.getHorarioTabela(time,4).get(0);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testaGetHorarioTabelaFloridaGua(){
        Time time = Time.valueOf("06:40:00");
        Time esperado = Time.valueOf("06:50:00");
        Time resultado = onibusDAO.getHorarioTabela(time,5).get(0);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testaGetHorarioTabelaColinaGua(){
        Time time = Time.valueOf("20:00:00");
        Time esperado = Time.valueOf("20:35:00");
        Time resultado = onibusDAO.getHorarioTabela(time,6).get(0);
        assertEquals(esperado,resultado);
    }

}
