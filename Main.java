package pedagio.main;

import pedagio.application.InMemoryPracaRepository;
import pedagio.domain.entity.PracaPedagio;
import pedagio.domain.entity.Veiculo;
import pedagio.domain.repository.PracaRepository;

public class Main {
    public static void main(String[] args) {
        PracaRepository repo = new InMemoryPracaRepository();

        PracaPedagio praca1 = new PracaPedagio("Rodovia Anhanguera", 10.0);
        PracaPedagio praca2 = new PracaPedagio("Rodovia Imigrantes", 8.0);

        repo.salvar(praca1);
        repo.salvar(praca2);

        praca1.registrarPassagem(new Veiculo("ABC1234", "carro", 0));
        praca1.registrarPassagem(new Veiculo("DEF5678", "moto", 0));
        praca2.registrarPassagem(new Veiculo("GHI9999", "caminhao", 4));

        for (PracaPedagio praca : repo.listarTodas()) {
            System.out.println("📍 " + praca.getLocalizacao());
            System.out.println("Total arrecadado: R$" + praca.getValorTotalArrecadado());
            System.out.println("---------------------------");
        }
    }
}

