package org.example.Exercicio12;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(Usuario destinatario, String mensagem) {
        Chat.enviarMensagem(this, destinatario, mensagem);
    }
}
