public class Main {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Franciele", "Oliveira", 9500);
        Empregado emp2 = new Empregado("Ana", "Veiga", 12000);

        System.out.println("Salário anual de " + emp1.getPrimeiroNome() + ": R$ " + emp1.getSalarioAnual());
        System.out.println("Salário anual de " + emp2.getPrimeiroNome() + ": R$ " + emp2.getSalarioAnual());

        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + emp1.getPrimeiroNome() + ": R$ " + emp1.getSalarioAnual());
        System.out.println("Salário anual de " + emp2.getPrimeiroNome() + ": R$ " + emp2.getSalarioAnual());

        System.out.println("\n" + emp1.getPrimeiroNome() + " ganha bem? " + emp1.ganhaBem());
        System.out.println(emp2.getPrimeiroNome() + " ganha bem? " + emp2.ganhaBem());
    }
}
