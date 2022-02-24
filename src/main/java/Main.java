public class Main {
    public static void main(String[] args) {
        Cliente ericklis = new Cliente();
        ericklis.setNome("Ericklis");

        Conta cc = new ContaCorrente(ericklis);
        Conta poupanca = new ContaPoupanca(ericklis);

        cc.depositar(1000);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
