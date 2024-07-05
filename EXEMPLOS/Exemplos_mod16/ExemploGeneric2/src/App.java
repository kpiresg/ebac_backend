import dao.ClienteMapDAO;
import dao.IClienteDAO;
import dao.IProdutoDAO;
import dao.ProdutoMapDAO;
import domain.Cliente;
import domain.Produto;

public class App {

    public static void main(String[] args) {

        IClienteDAO iClienteDAO = new ClienteMapDAO();

        iClienteDAO.cadastrar(new Cliente(
                "Kauan",
                "123",
                "17",
                "Macaé",
                "RJ"
        ));

        IProdutoDAO iProdutoDAO = new ProdutoMapDAO();

        iProdutoDAO.cadastrar(new Produto(
                12l,
                "ketchup"));

        System.out.println(iProdutoDAO.buscarTodos());
        System.out.println(iClienteDAO.buscarTodos());
    }
}
