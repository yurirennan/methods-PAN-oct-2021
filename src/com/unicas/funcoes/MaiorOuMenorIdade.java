package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class MaiorOuMenorIdade {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Você é menor de idade");
        } else {
            JOptionPane.showMessageDialog(null, "Você é maior de idade");
        }
    }
}
