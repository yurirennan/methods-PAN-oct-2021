package metodos.sem.retorno;

public class Conta {
    public int conta;
    public String titular;
    public double saldo;


    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

}
