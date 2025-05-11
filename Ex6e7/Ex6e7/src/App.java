import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Informe o nome do Estudante:");
        String est = sc1.nextLine();

        System.out.println("Informe 3 notas");
        double n1 = sc2.nextDouble();
        double n2 = sc2.nextDouble();
        double n3 = sc2.nextDouble();

        try {
            Estudante e1 = new Estudante(est, n1, n2, n3);

            System.out.println("Média: " + e1.calcularMedia());
            System.out.println("Média com ponto extra: " + e1.atribuirPontoExtra());
            System.out.println("Média Lambda: " + e1.calcularMedia((x1, x2, x3) -> x1 * 0.4 + x2 * 0.3 + x3 * 0.3));

        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }        
    }
}
