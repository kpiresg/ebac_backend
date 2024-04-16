public class Main {

    public static void main(String[] args) {

        Assalariado empregado = new Assalariado();

        empregado.setSalario(100d);
        empregado.setNome("Kauan");
        empregado.setSobrenome("Pires");
        empregado.setCpf("195.750.127-80");
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();

        comissionado.setNome("Lucas");
        comissionado.setSobrenome("Barbosa");
        comissionado.setCpf("123.123.123-12");
        comissionado.setTotalVenda(100d);
        imprimir(comissionado);

    }

    public static void imprimir(Empregado empregado) {

        empregado.print(empregado.getNome() + " Tem " + empregado.vencimento() + " de salario.");
    }
}
