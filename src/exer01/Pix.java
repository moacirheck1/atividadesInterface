package exer01;

public class Pix implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {

        System.out.println("pamagmenot realizado com sucesso " + valor);
    }

}
