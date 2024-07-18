import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta>contas ;
    public Banco(){
        this.contas= new ArrayList<>();
    }
    public void adicionarContas(Conta conta){
        contas.add(conta);
    }
    public Conta buscarConta(int numero){
        for (Conta conta : contas){
            if (conta.getNumero() ==numero){
                return conta;
            }
        }
        return null ;
    }
    public void listarContas(){
        for (Conta conta : contas){
            System.out.println("Número da conta: " + conta.getNumero() + ", Cliente: " + conta.getCliente().getNome() + ", Saldo: " + conta.getSaldo());
        }
    }
}
