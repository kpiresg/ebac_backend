package GenericClienteEProduto.TemplateMethod;

import GenericClienteEProduto.dao.ClienteMapDAO;
import GenericClienteEProduto.dao.IClienteDAO;
import GenericClienteEProduto.domain.Cliente;

import java.util.Scanner;

public class SelectMethod {

    private SelectMethod() {}
    private static SelectMethod selectMethod;
    public static SelectMethod getInstance() {
        if(selectMethod == null) {
            selectMethod = new SelectMethod();
        }
        return selectMethod;
    }



    CreateClient createClient = new CreateClient();
    IClienteDAO iClienteDAO = new ClienteMapDAO();
    ChangeClient changeClient = ChangeClient.getInstance();
    String selected;

    public void setSelected() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Cadastrar" +
                "\n2 - Alterar" +
                "\n3 - Consultar" +
                "\n4 - Mostrar Todos" +
                "\n5 - Excluir" +
                "\n6 - Sair");

        this.selected = scan.nextLine();
    }

    public void selectMethod() {
        if (this.selected.equals("1")) {
            this.createClient.setInitValues();

            Cliente cliente = new Cliente(createClient.getName(),
                    createClient.getCpf(),
                    createClient.getIdade(),
                    createClient.getCity());

            iClienteDAO.cadastrar(cliente);
            System.out.println("Cliente criado: \n" + iClienteDAO.consultar(cliente.getCpf()));

        }
        else if (this.selected.equals("2")) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o cpf para alterar: \n");
            Long cpf = scan.nextLong();

            changeClient.setClient();
            iClienteDAO.alterar(cpf);

        }
        else if (this.selected.equals("3")) {
            changeClient.setCpf();
            System.out.println("Cliente encontrado: \n" + iClienteDAO.consultar(changeClient.getCpf()));

        }
        else if (this.selected.equals("4")) {
            System.out.println(iClienteDAO.buscarTodos());

        }
        else if(this.selected.equals("5")) {
            changeClient.setCpf();
            System.out.println("Cliente excluido: \n" + iClienteDAO.consultar(changeClient.getCpf()));
            iClienteDAO.excluir(changeClient.getCpf());

        }
        else if (this.selected.equals("6")) {

            System.exit(0);

        }
    }


}
