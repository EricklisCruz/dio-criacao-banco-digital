import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements iConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Getter @Setter protected int agencia;
    @Getter @Setter protected int numero;
    @Getter @Setter protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia =Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        this.saldo = saldo - valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInforsComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
