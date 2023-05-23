package exer01;

public class CartaoDeCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("pamagmenot realizado com sucesso " + valor);
    }

}
