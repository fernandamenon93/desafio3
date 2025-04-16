package pedagio.domain.repository;

import pedagio.domain.entity.PracaPedagio;
import java.util.List;

public interface PracaRepository {
    void salvar(PracaPedagio praca);
    List<PracaPedagio> listarTodas();
    PracaPedagio buscarPorLocalizacao(String local);
}
