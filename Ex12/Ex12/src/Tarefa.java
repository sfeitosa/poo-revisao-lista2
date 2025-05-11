import java.util.Calendar;

public class Tarefa {
    private String descricao;
    private Calendar prazo;
    private int prioridade;

    public Tarefa(String descricao, Calendar prazo, int prioridade) throws TarefaInvalidaException {
        setDescricao(descricao);
        setPrazo(prazo);
        setPrioridade(prioridade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws TarefaInvalidaException {

        if (descricao.trim().length() == 0) {
            throw new TarefaInvalidaException("Descrição não pode ser vazia");
        }

        this.descricao = descricao;
    }

    public Calendar getPrazo() {
        return prazo;
    }

    public void setPrazo(Calendar prazo) throws TarefaInvalidaException {
        Calendar now = Calendar.getInstance();

        if (prazo.before(now)) {
            throw new TarefaInvalidaException("Prazo não pode ser no passado!");
        }

        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", prazo=" + prazo + ", prioridade=" + prioridade + "]";
    }
    
}
