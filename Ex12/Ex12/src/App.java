import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Calendar dataF = Calendar.getInstance();
        Calendar dataP = Calendar.getInstance();

        dataF.set(Calendar.DAY_OF_MONTH, dataF.get(Calendar.DAY_OF_MONTH) + 5);
        dataP.set(Calendar.DAY_OF_MONTH, dataP.get(Calendar.DAY_OF_MONTH) - 2);

        GerenciadorTarefas gt = new GerenciadorTarefas();


        try {
            Tarefa t1 = new Tarefa("Estudar", dataF, 1);
            Tarefa t2 = new Tarefa("Trabalhar", dataP, 1);

            gt.adicionar(t1);
            gt.adicionar(t2);

            gt.listar();
        }
        catch (TarefaInvalidaException e) {
            System.out.println(e.getMessage());
        }


    }
}
