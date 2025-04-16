package pedagio.domain.entity;

public class RegistroPassagem {
    private Veiculo veiculo;
    private double valor;

    public RegistroPassagem(Veiculo veiculo, double valor) {
        this.veiculo = veiculo;
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public double getValor() {
        return valor;
    }
}
