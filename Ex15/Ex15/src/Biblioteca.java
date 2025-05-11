import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Biblioteca<T extends ItemEmprestavel> {
    private List<T> acervo;
    
    public Biblioteca() {
        acervo = new ArrayList<>();
    }

    public void adicionar(T item) {
        acervo.add(item);
    }

    public void remover(int pos) {
        acervo.remove(pos);
    }

    public List<T> buscarItens(Predicate<T> f) {
        return acervo.stream().filter(f).collect(Collectors.toList());
    }
}
