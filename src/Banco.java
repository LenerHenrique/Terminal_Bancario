import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List <Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero){
        for (Conta conta : this.contas){
            if(conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

}
