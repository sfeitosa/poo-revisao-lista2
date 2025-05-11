public class CamaroteInferior extends IngressoVIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) throws Exception {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    
    
}
