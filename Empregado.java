public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }

    public boolean ganhaBem() {
        return salarioMensal > 10000;
    }
}
