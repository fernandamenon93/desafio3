package pedagio.application;

import pedagio.domain.entity.PracaPedagio;
import pedagio.domain.repository.PracaRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPracaRepository implements PracaRepository {
    private List<PracaPedagio> pracas = new ArrayList<>();

    @Override
    public void salvar(PracaPedagio praca) {
        pracas.add(praca);
    }

    @Override
    public List<PracaPedagio> listarTodas() {
        return pracas;
    }

    @Override
    public PracaPedagio buscarPorLocalizacao(String local) {
        return pracas.stream()
                .filter(p -> p.getLocalizacao().equalsIgnoreCase(local))
                .findFirst()
                .orElse(null);
    }
}
