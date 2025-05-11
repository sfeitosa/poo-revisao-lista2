import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RepositorioGenerico<T> {
    List<T> dados;

    public RepositorioGenerico() {
        dados = new ArrayList<>();
    }

    public void adicionar(T info) {
        dados.add(info);
    }

    public void remover(int pos) {
        dados.remove(pos);
    }

    public List<T> buscar(Predicate<T> f) {
        return dados.stream().filter(f).collect(Collectors.toList());
    }
}