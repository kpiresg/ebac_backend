import javax.swing.*;

public class ClienteDAO {

    public static void consultarCliente() throws ClienteNotFoundException {

        boolean isCadastrado = false;

        if (!isCadastrado) {
            throw new ClienteNotFoundException("Cliente não encontrado");
        }
    }
}
