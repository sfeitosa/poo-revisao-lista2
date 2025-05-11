public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca<Livro> b1 = new Biblioteca<>();

        Livro l1 = new Livro("Livro 1", "Autor 1");
        Livro l2 = new Livro("Livro 2", "Autor 1");

        b1.adicionar(l1);
        b1.adicionar(l2);

        System.out.println(b1.buscarItens((l) -> l.getAutor().equals("Autor 1")));

        Biblioteca<Revista> b2 = new Biblioteca<>();

        Revista r1 = new Revista("Titulo 1", 50);
        Revista r2 = new Revista("Titulo 2", 100);

        b2.adicionar(r1);
        b2.adicionar(r2);

        System.out.println(b2.buscarItens(r -> r.getNrPaginas() > 60));

    }
}
