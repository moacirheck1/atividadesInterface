package exer01;


public class main {
    public static void main(String[] args) {
        Pagamento cartaoDeCredito=new CartaoDeCredito();
        Pagamento pix=new Pix();
        Pagamento transferenciaBancaria=new TransferenciaBancaria();
        cartaoDeCredito.realizarPagamento(1000);
        pix.realizarPagamento(2000);
        transferenciaBancaria.realizarPagamento(100000);
    }
   
}
