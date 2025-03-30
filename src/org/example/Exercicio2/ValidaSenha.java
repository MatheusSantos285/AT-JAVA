package org.example.Exercicio2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();

        validarComplexidade(senha);
    }

    public static void validarComplexidade(String senha) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}");
        Matcher matcher = pattern.matcher(senha);

        while (!matcher.find() || senha.length() < 8) {
            System.out.println("A senha deve ter no mínimo 8 caracteres, uma letra maiúscula, um número e um caractere especial. Digite uma senha válida:");
            senha = scanner.nextLine();
            matcher = pattern.matcher(senha);
        }

        System.out.println("Senha válida!");
    }
}

