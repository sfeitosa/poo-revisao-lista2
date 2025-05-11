public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) throws Exception {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double retornaValor() {
        return this.retornaValor() + valorAdicional;
    }
}