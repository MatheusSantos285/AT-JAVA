package org.example.Exercicio10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GerenciadorArquivo {
    private static final String NOME_ARQUIVO = "compras.txt";

    public void criarArquivo() throws IOException {
        Path arquivo = Path.of(NOME_ARQUIVO);
        if (!Files.exists(arquivo)) {
            Files.createFile(arquivo);
            System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
        }
    }

    public void escreverNoArquivo(List<Compra> compras) throws IOException {
        Path arquivo = Path.of(NOME_ARQUIVO);
        StringBuilder builder = new StringBuilder();

        for (Compra compra : compras) {
            builder.append(compra.toString()).append("\n");
        }

        Files.writeString(arquivo, builder.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Compras salvas no arquivo!");
    }

    public void lerArquivo() throws IOException {
        Path arquivo = Path.of(NOME_ARQUIVO);
        if (Files.exists(arquivo)) {
            System.out.println("\n=== Conteúdo do Arquivo ===");
            Files.readAllLines(arquivo).forEach(System.out::println);
        } else {
            System.out.println("Arquivo não encontrado: " + arquivo.toAbsolutePath());
        }
    }
}
