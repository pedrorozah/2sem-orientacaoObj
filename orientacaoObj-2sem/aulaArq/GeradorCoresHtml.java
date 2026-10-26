import java.io.BufferedWriter;
import java.io.FileWriter;

public class GeradorCoresHtml {
    BufferedWriter arqGravacao;

    public static void main(String[] args) throws Exception {
        // define o nome do arquivo a ser gerado;
        String nomeArqSaida = "tabela_cores.html";

        // cria um objeto para acessar atributos e funções (statico)
        GeradorCoresHtml geradorCores = new GeradorCoresHtml();

        // cria/abre o arquivo a ser escrito e escreve/sobreescreve nesse comportamento
        // (FileWriter without second paratmether as true)
        geradorCores.arqGravacao = new BufferedWriter(
                new FileWriter(nomeArqSaida));
        geradorCores.gerarCabecalho();
        geradorCores.gerarCores();

        // fecha o arquivo
        geradorCores.arqGravacao.close();
    }

    private void gerarCabecalho() throws Exception {
        // escreve no arquivo
        arqGravacao.write("<html><head><title>Tabela de Cores HTML</title>\n" +
                "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head>\n" +
                "<body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2>\n" +
                "<table width='400' align='center' border='1'>\n" +
                "<tr><th width='200' align='center'>Cor</th>\n" +
                "<th width='200' align='center'>Código Hexadecimal</th></tr>");
        // adiciona quebra de linha
        arqGravacao.newLine();
    }

    private void gerarCores() throws Exception {
        String[] hexa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "A", "B", "C", "D", "E", "F" };

        for (int r = 0; r < hexa.length; r++) {
            for (int g = 0; g < hexa.length; g++) {
                for (int b = 0; b < hexa.length; b++) {
                    String cor = "#" + hexa[r] + "0" + hexa[g] + "0" + hexa[b] + "0";
                    arqGravacao.write("<tr>");
                    arqGravacao.newLine();
                    arqGravacao.write("<td bgcolor='" + cor + "'>");
                    arqGravacao.newLine();
                    arqGravacao.write("<td align='center'>" + cor + "</td>");
                    arqGravacao.newLine();
                    arqGravacao.write("</tr>");
                    arqGravacao.newLine();
                }
            }
        }
    }
}