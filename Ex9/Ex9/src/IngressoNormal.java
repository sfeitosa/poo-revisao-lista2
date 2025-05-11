public class IngressoNormal extends Ingresso {
    public IngressoNormal(double valor) throws Exception {
        super(valor);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso normal!");
    }
}