package org.example.Exercicio5;

public class Terraqueos {
    public static void main(String[] args) {

        StringBuilder mensagemHTTP = new StringBuilder();

        mensagemHTTP.append("Content-Type: text/html\n\n");
        mensagemHTTP.append("<html>\n");
        mensagemHTTP.append("<head><title>Saudação CGI</title></head>\n");
        mensagemHTTP.append("<body>\n");
        mensagemHTTP.append("<h1>Olá, Terráqueos!</h1>\n");
        mensagemHTTP.append("</body>\n");
        mensagemHTTP.append("</html>\n");

        System.out.println(mensagemHTTP.toString());
    }
}
