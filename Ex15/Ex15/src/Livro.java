public class Livro implements ItemEmprestavel {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }



    public void emprestar() {

    }

    public void devolver() {

    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + "]";
    }

    
}
