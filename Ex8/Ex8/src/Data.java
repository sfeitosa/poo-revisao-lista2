public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws Exception {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia < 1 || dia > 31) {
            throw new Exception("Dia inválido!");
        }

        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes < 1 || mes > 12) {
            throw new Exception("Mês inválido!");
        }

        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception {
        if (ano < 0) {
            throw new Exception("Ano inválido!");
        }
        this.ano = ano;
    }

    public boolean estaEntre(Data d1, Data d2) {

        if (ano < d1.ano || ano > d2.ano) {
            return false;
        }

        if (mes < d1.mes || mes > d2.mes) {
            return false;
        }

        if (dia < d1.dia || dia > d2.dia) {
            return false;
        }

        return true;

    }

}