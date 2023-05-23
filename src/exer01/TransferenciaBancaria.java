package exer01;

public class TransferenciaBancaria implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("pamagmenot realizado com sucesso " + valor);
    }

}
