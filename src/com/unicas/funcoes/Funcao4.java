package com.unicas.funcoes;

public class Funcao4 {
    static int myFunction(int x) {
        return ++x;
    }

    static int myFunction2(int y) {
        return y++;
    }

    public static void main(String[] args) {
        System.out.println(myFunction((5)));
    }
}
