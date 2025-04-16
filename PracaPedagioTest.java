package pedagio.test;

import pedagio.domain.entity.PracaPedagio;
import pedagio.domain.entity.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracaPedagioTest {

    @Test
    public void deveCalcularValorCarro() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo v = new Veiculo("XXX1234", "carro", 0);
        assertEquals(10.0, praca.calcularValor(v));
    }

    @Test
    public void deveCalcularValorMoto() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo v = new Veiculo("XXX1234", "moto", 0);
        assertEquals(5.0, praca.calcularValor(v));
    }

    @Test
    public void deveCalcularValorCaminhao() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo v = new Veiculo("XXX1234", "caminhao", 3);
        assertEquals(30.0, praca.calcularValor(v));
    }
}
