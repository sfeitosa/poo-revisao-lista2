public class App {
    public static void main(String[] args) throws Exception {
        Hora h1 = new Hora(2, 0, 0);
        Hora h2 = new Hora(2, 0 , 0);
        Hora h3 = new Hora(6, 0, 0);

        System.out.println(h1.estaEntre(h2, h3));

        Data d1 = new Data(1, 1, 2025);
        Data d2 = new Data(1, 1, 2024);
        Data d3 = new Data(1, 1, 2026);

        System.out.println(d1.estaEntre(d2, d3));
    }
}
