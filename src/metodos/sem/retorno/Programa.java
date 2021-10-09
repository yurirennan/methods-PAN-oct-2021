package metodos.sem.retorno;

public class Programa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 500.00;
        conta1.titular = "Yuri";
        conta1.sacar(20);

        System.out.println("Saldo: " + conta1.saldo);

    }
}
