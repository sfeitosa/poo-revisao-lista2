public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(int hora, int minuto, int segundo) throws Exception {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        if (hora < 0 || hora > 23) {
            throw new Exception("Hora inválida!");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws Exception {
        if (minuto < 0 || minuto > 59) {
            throw new Exception("Minuto inválido!");
        }

        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) throws Exception {
        if (segundo < 0 || segundo > 59) {
            throw new Exception("Segundo inválido!");
        }
        this.segundo = segundo;
    }

    public boolean estaEntre(Hora h1, Hora h2) {
        if (this.hora < h1.hora || this.hora > h2.hora) {
            return false;
        }

        if (this.minuto < h1.minuto || this.minuto < h2.minuto) {
            return false;
        }

        if (this.segundo < h1.segundo || this.minuto < h2.minuto) {
            return false;
        }

        return true;
    }

}
