public class App {

    public static boolean filtraAnoLancamento(Midia m) {
        return m.getAnoLancamento() > 2010;
    }

    public static void main(String[] args) throws Exception {
        Midia m1 = new Midia("Terror", 10, 2025);
        Midia m2 = new Midia("Fantasia", 205, 2000);

        CatalogoMidias c = new CatalogoMidias();

        c.adicionaMidia(m1);
        c.adicionaMidia(m2);

        System.out.println(c.buscar((m) -> m.getAnoLancamento() > 2010));

        System.out.println(c.buscar(App::filtraAnoLancamento));
    }
}
