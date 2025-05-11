import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CatalogoMidias {
    private List<Midia> midias;

    public CatalogoMidias() {
        midias = new ArrayList<>();
    }

    public void adicionaMidia(Midia m) {
        midias.add(m);
    }

    public List<Midia> buscar(Predicate<Midia> p) {
        return midias.stream().filter(p).collect(Collectors.toList());
    }
}
