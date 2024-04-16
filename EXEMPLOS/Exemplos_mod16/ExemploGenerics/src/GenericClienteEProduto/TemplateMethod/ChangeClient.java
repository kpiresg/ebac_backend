package GenericClienteEProduto.TemplateMethod;

import java.util.Scanner;

public class ChangeClient {

    private ChangeClient() {}
    private static ChangeClient changeClient;
    public static ChangeClient getInstance() {
        if(changeClient == null) {
            changeClient = new ChangeClient();
        }
        return changeClient;
    }


    String nome;
    int idade;
    String cidade;
    Long cpf;

    public void setClient() {
        Scanner scanToChange = new Scanner(System.in);
        Scanner scanToChange2 = new Scanner(System.in);

        System.out.println("Mude o nome: ");
        this.nome = scanToChange.nextLine();

        System.out.println("Mude a idade: ");
        this.idade = scanToChange.nextInt();

        System.out.println("Mude a cidade: ");
        this.cidade = scanToChange2.nextLine();
    }

    public void setCpf() {

        Scanner scanCpf = new Scanner(System.in);
        System.out.println("Digite o cpf: ");

        this.cpf = scanCpf.nextLong();

    }

    public Long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }
}
