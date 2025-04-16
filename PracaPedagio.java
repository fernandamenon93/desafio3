package pedagio.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<RegistroPassagem> registros = new ArrayList<>();

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public double calcularValor(Veiculo veiculo) {
        return switch (veiculo.getTipo()) {
            case "moto" -> tarifaBase / 2;
            case "caminhao" -> tarifaBase * veiculo.getEixos();
            default -> tarifaBase;
        };
    }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = calcularValor(veiculo);
        registros.add(new RegistroPassagem(veiculo, valor));
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<RegistroPassagem> getRegistros() {
        return registros;
    }

    public double getValorTotalArrecadado() {
        return registros.stream().mapToDouble(RegistroPassagem::getValor).sum();
    }
}
