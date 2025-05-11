public class Ingresso {
    private double valor;

    public Ingresso(double valor) throws Exception {
        setValor(valor);
    }

    public double retornaValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Não existe ingresso com valor negativo!");
        }

        this.valor = valor;
    }

    
}