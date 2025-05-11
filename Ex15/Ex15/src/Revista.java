public class Revista implements ItemEmprestavel {
    private String titulo;
    private int nrPaginas;

    public Revista(String titulo, int nrPaginas) {
        this.titulo = titulo;
        this.nrPaginas = nrPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }



    public void emprestar() {

    }

    public void devolver() {

    }

    @Override
    public String toString() {
        return "Revista [titulo=" + titulo + ", nrPaginas=" + nrPaginas + "]";
    }

    
}
