public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Alice", "12345678900");
        Conta conta1 = new Conta(1, cliente1);
        banco.adicionarContas(conta1);

        Cliente cliente2 = new Cliente("Bob", "98765432100");
        Conta conta2 = new Conta(2, cliente2);
        banco.adicionarContas(conta2);

        conta1.depositar(500);
        conta2.depositar(1000);

        banco.listarContas();

        conta1.sacar(200);
        banco.listarContas();
    }
}

