package GenericClienteEProduto;
import GenericClienteEProduto.TemplateMethod.SelectMethod;

public class App {

    public static void main(String[] args) {

        SelectMethod selectMethod = SelectMethod.getInstance();

        while (1 == 1) {
            selectMethod.setSelected();
            selectMethod.selectMethod();
        }
    }
}
