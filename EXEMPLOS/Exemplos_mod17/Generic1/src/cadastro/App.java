package cadastro;

import cadastro.dao.ClienteMapDAO;
import cadastro.dao.IClienteDAO;
import cadastro.dao.generic.IGenericDAO;
import cadastro.domain.Cliente;

import javax.swing.*;

public class App {
    static Integer opcao;
    static IClienteDAO iClienteDAO = new ClienteMapDAO();

    public static void main(String[] args) {
        menu();

        while(!opcao.equals(6)) {
            switch (opcao) {
                case 1:
                    cadastrar();
                    menu();
                break;
                case 2:
                    alterar();
                    menu();
                    break;
                case 3:
                    excluir();
                    menu();
                    break;
                case 4:
                    buscar();
                    menu();
                break;
                case 5:
                    buscarTodos();
                    menu();
                break;
                case 6:
                    System.exit(0);
                break;
                default:
                    menu();
                    break;
             }

         }
    }

    public static void menu() {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro / 2 - Alterar / 3 - Excluir /" +
                " 4 - Consultar / 5 - Mostrar Todos / 6 - Sair"));
    }

    public static void cadastrar() {
        Cliente cliente = new Cliente(JOptionPane.showInputDialog("Digite o nome: "),
                JOptionPane.showInputDialog("Digite a idade: "),
                JOptionPane.showInputDialog("Digite o cpf: "));

        iClienteDAO.cadastrar(cliente);
    }

    public static void alterar() {
        Long codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf para alterar: "));

        Cliente changeCliente = new Cliente(JOptionPane.showInputDialog("Altere o nome: "),
                JOptionPane.showInputDialog("Altere a idade: "), codigo.toString());

        iClienteDAO.alterar(codigo, changeCliente);

    }

    public static void excluir() {
        Long codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf para deletar: "));
        JOptionPane.showMessageDialog(null, "Cliente: \n" + iClienteDAO.buscar(codigo) + " Deletado", "Deletando", JOptionPane.INFORMATION_MESSAGE);
        iClienteDAO.excluir(codigo);
    }

    public static void buscar() {
        Long codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o cpf para buscar: "));
        JOptionPane.showMessageDialog(null, "Cliente: \n" + iClienteDAO.buscar(codigo), "Buscando", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void buscarTodos() {
        JOptionPane.showMessageDialog(null, "Clientes encontrados: \n" + iClienteDAO.buscarTodos(), "Buscar todos", JOptionPane.INFORMATION_MESSAGE);
    }
}
