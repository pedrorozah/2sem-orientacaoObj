import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        Arquivo arqEntrada = new Arquivo(null);
        Arquivo arqSaida = new Arquivo(null);
        String op = "-1";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("\n\n=============== MENU ================");

            // se nome do arquivo de entrada/saída estiver vazio, chama opções pra definir
            if (!arqEntrada.nomeCadastrado() || !arqSaida.nomeCadastrado()) {
                System.out.println("1. Informar nome arquivo entrada/saída;");
                System.out.println("2. Utilizar arquivos entrada/saída padrão (preco_custo.csv/preco_venda.csv);");
                System.out.println("0. Encerrar programa;");

                System.out.print("\nDigite a opção: ");
                op = teclado.readLine();

                switch (op) {
                    case "1":
                        if (!arqEntrada.nomeCadastrado()) {
                            System.out.print(
                                    "\nDigite o nome do arquivo de entrada (custo): ");
                            arqEntrada.setNomeArquivo(teclado.readLine());
                        }

                        if (!arqSaida.nomeCadastrado()) {
                            System.out.print("\nDigite o nome do arquivo de saída (venda): ");
                            arqSaida.setNomeArquivo(teclado.readLine());

                        }
                        continue;
                    case "2":
                        if (!arqEntrada.nomeCadastrado()) {
                            arqEntrada.setNomeArquivo("preco_custo.csv");
                            System.out.print(
                                    "\nNome do arquivo de entrada (custo): " + arqEntrada.getNomeArquivo());
                        }

                        if (!arqSaida.nomeCadastrado()) {
                            arqSaida.setNomeArquivo("preco_venda.csv");
                            System.out
                                    .print("\nNome do arquivo de saída (venda): " + arqSaida.getNomeArquivo());
                        }
                        continue;

                    case "0":
                        break;

                    default:
                        System.err.println("\nOpção inválida, informe opção 1 ou 2.");
                        continue;

                }
            } else {
                arqEntrada.criarArquivo("entrada");
                arqSaida.criarArquivo("saída");

                System.out.println("1. Cadastrar produto;");
                System.out.println("2. Calcular margem de lucro sobre produtos;");
                System.out.println("3. Gerar arquivo comprar.csv (itens com estoque < 10);");
                System.out.println("0. Encerrar programa;");
                op = teclado.readLine();

                switch (op) {
                    case "1":

                        break;

                    default:
                        break;
                }

            }

        } while (!op.equals("0"));

        System.out.println("Encerrando programa...");
    }

}
