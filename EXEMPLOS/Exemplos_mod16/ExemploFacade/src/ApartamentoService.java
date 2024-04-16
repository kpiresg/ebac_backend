public class ApartamentoService implements IApartamentoService {

    private void procurarApartamento(){
        System.out.println("Procurando apartamento");
    }
    private void procurarContato(){
        System.out.println("Procurando contato");
    }
    private void procurarValor(){
        System.out.println("Procurando valor");
    }


    @Override
    public void alugarApartamento() {
        procurarApartamento();
        procurarContato();
        procurarValor();
    }
}
