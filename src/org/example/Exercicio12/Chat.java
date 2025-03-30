package org.example.Exercicio12;

import java.util.Scanner;

public class Chat {
    private static final int MAX_MENSAGENS = 10;
    private static String[] mensagens = new String[MAX_MENSAGENS];
    private static int indiceMensagem = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Usuario ultimoRemetente = null;

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao chat!");

        System.out.println("Digite o nome do primeiro usuário:");
        String nomeUsuario1 = scanner.nextLine();
        Usuario usuario1 = new Usuario(nomeUsuario1);

        System.out.println("Digite o nome do segundo usuário:");
        String nomeUsuario2 = scanner.nextLine();
        Usuario usuario2 = new Usuario(nomeUsuario2);

        trocaDeMensagens(usuario2, usuario1);
    }

    private static void trocaDeMensagens(Usuario usuario2, Usuario usuario1) {
        while (indiceMensagem < MAX_MENSAGENS) {
            Usuario remetente = (ultimoRemetente == null || ultimoRemetente == usuario2) ? usuario1 : usuario2;
            Usuario destinatario = (remetente == usuario1) ? usuario2 : usuario1;

            System.out.println("\n" + remetente.getNome() + ", digite a sua mensagem:");
            String mensagem = scanner.nextLine();

            enviarMensagem(remetente, destinatario, mensagem);
            ultimoRemetente = remetente;
        }
        exibirMensagens();
        scanner.close();
    }

    public static void enviarMensagem(Usuario remetente, Usuario destinatario, String mensagem) {
        if (indiceMensagem < MAX_MENSAGENS) {
            mensagens[indiceMensagem] = remetente.getNome() + ": " + mensagem;
            indiceMensagem++;
        }

    }

    public static void exibirMensagens() {
        System.out.println("\n=== Histórico de mensagens ===");

        for (int i = 0; i < indiceMensagem; i++) {
            System.out.println(mensagens[i]);
        }
        System.out.println("=== Fim do histórico ===");
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
