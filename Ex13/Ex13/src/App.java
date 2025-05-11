public class App {
    public static void main(String[] args) throws Exception {
        RepositorioGenerico<Integer> rg = new RepositorioGenerico<>();

        rg.adicionar(10);
        rg.adicionar(20);
        rg.adicionar(30);
        rg.adicionar(40);

        System.out.println(rg.buscar((info) -> info > 20));

    }
}
