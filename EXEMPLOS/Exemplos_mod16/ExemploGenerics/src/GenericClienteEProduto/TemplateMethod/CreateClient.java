package GenericClienteEProduto.TemplateMethod;

import java.util.Scanner;

public class CreateClient {
    String name;
    String cpf;
    String idade;
    String city;

    public void setInitValues() {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        this.name = scan1.nextLine();

        System.out.println("Digite o cpf: ");
        this.cpf = scan1.nextLine();

        System.out.println("Digite a idade: ");
        this.idade = scan1.nextLine();

        System.out.println("Digite a cidade natal: ");
        this.city = scan1.nextLine();

    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return idade;
    }

    public String getCity() {
        return city;
    }
}
