import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionar(Tarefa t) {
        tarefas.add(t);
    }

    public void remover(int pos) {
        tarefas.remove(pos);
    }

    public void listar() {
        tarefas.forEach(t -> System.err.println(t));
    }
}
