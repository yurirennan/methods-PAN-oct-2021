package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Maria");
        lista.add("pé");
        lista.add("feijão");
        lista.remove("pé");

        System.out.println(lista.size());
        lista.forEach(System.out::println);

        System.out.println("----------------------");

        List<Integer> itens = Arrays.asList(11, 100, 29, 8, 27);
        itens.stream().filter(i -> i > 16).forEach(num -> {
            System.out.println(num * 2);
        });

    }
}
