
package exer03;

public class Main {
    public static void main(String[] args) {
        CalculoSalario analista=new Analista();
        CalculoSalario desenvolvedor=new Desenvolvedor();
        CalculoSalario gerente=new Gerente();
        analista.calcularSalario();
        desenvolvedor.calcularSalario();
        gerente.calcularSalario();
    }
            
}
