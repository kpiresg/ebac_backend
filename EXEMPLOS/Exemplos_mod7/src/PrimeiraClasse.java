public class PrimeiraClasse {
    public static void main (String[] args) {
        System.out.println("Ola Kauan");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        cliente.setNome("Kauan");
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereço();
        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());
    }
}
