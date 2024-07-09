import javax.swing.*;

public class APPCliente {

    public static void main(String[] args) {
        try {
            JOptionPane.showInputDialog(null, "Digite o cpf");
            ClienteService.consultarCliente();

        } catch (ClienteNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
