package br.com.kpires;

import br.com.kpires.dao.ClienteMapDAO;
import br.com.kpires.dao.IClienteDAO;
import br.com.kpires.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração, 5 para sair.",
                "CADASTRO", JOptionPane.INFORMATION_MESSAGE);

        while(!isOpcaoValida(opcao)) {

            if(opcao.equals("")) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração, 5 para sair.",
                "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaoValida(opcao)) {

            if (isCadastrar(opcao)) {

                String dados = JOptionPane.showInputDialog(null,
                        "Digite os valores(nome, cpf, telefone, endereço, numero, cidade, estado) separados por virgula \nExemplo: lucas,123,402,rua tal,num tal,cidade tal,estado tal",
                        "CADASTRAR", JOptionPane.INFORMATION_MESSAGE);

                cadastro(dados);
            } else if (isConsultar(opcao)) {

                String dados = JOptionPane.showInputDialog(null, "Digite o cpf para consultar:", "CONSULTAR", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {

                String dados = JOptionPane.showInputDialog(null, "Digite o cpf que deseja excluir", "EXCLUSAO", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAlteracao(opcao)) {

                String dados = JOptionPane.showInputDialog(null, "Digite o cpf do cliente que deseja alterar,", "ALTERACAO", JOptionPane.INFORMATION_MESSAGE);
                alteracao(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração, 5 para sair.",
                    "CADASTRO", JOptionPane.INFORMATION_MESSAGE);


        }
    }

    private static void alteracao(String dados) {
        String newDados = JOptionPane.showInputDialog(null, "Digite os valores(nome, cpf, telefone, endereço, numero, cidade, estado) separados por virgula \n Exemplo: lucas,123,402,rua tal,num tal,cidade tal,estado tal \nAltere:", "ALTERACAO", JOptionPane.INFORMATION_MESSAGE);
        String[] newDadosArray = newDados.split(",");
        Cliente cliente = new Cliente(newDadosArray[0],newDadosArray[1],newDadosArray[2],newDadosArray[3],newDadosArray[4],newDadosArray[5],newDadosArray[6]);
        iClienteDAO.alterar(cliente);
    }

    private static boolean isAlteracao(String opcao) {
        if (opcao.equals("4")) {
            return true;
        } else {
            return false;
        }
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
    }

    private static boolean isExclusao(String opcao) {
        if (opcao.equals("3")) {
            return true;
        } else {
            return false;
        }
    }

    private static void consultar(String dados) {
        Cliente consult = iClienteDAO.consultar(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente encontrado: " + consult.toString(), "consultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isConsultar(String opcao) {
        if (opcao.equals("2")) {
            return true;
        } else {
            return false;
        }
    }

    private static void cadastro(String dados) {
        String[] dadosCadastrados = dados.split(",");
        Cliente cliente = new Cliente(dadosCadastrados[0], dadosCadastrados[1], dadosCadastrados[2], dadosCadastrados[3], dadosCadastrados[4], dadosCadastrados[5], dadosCadastrados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "CadastroCompleto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente ja se encontra cadastrado", "ClienteExist", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static Boolean isCadastrar(String opcao) {
        if (opcao.equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Saindo...", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static Boolean isOpcaoValida(String opcao) {
        if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") ||
        opcao.equals("4") || opcao.equals("5")) {
            return true;
        } else {
            return false;
        }
    }
}
