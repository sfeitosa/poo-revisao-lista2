public class Midia {
    private String genero;
    private int duracao;
    private int anoLancamento;

    public Midia(String genero, int duracao, int anoLancamento) {
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "Midia [genero=" + genero + ", duracao=" + duracao + ", anoLancamento=" + anoLancamento + "]";
    }

    
}