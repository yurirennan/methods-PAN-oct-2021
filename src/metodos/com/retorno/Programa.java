package metodos.com.retorno;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Criando um objeto com retorno");

        MetodoRetorno teste = new MetodoRetorno();

        teste.atributo = 30;
        System.out.println(teste.metodo());
    }
}