import java.io.BufferedReader;
import java.io.FileReader;

public class Vendas {

    public static void main(String[] args) throws Exception {
        int qtdVendas = 0;
        int contador = 0;
        float totalVendas = 0;
        float vendasVista = 0;
        float vendasPrazo = 0;

        String nomeArq = "vendas.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArq));
        String linhaPlanilha;

        while ((linhaPlanilha = arqLeitura.readLine()) != null) {
            String vetCampos[] = linhaPlanilha.split(";");
            vetCampos[2] = vetCampos[2].replace(",", ".");

            if (contador != 0) {
                qtdVendas++;
                totalVendas += Float.parseFloat(vetCampos[2]);

                if (vetCampos[3].equals("V")) {
                    vendasVista += Float.parseFloat(vetCampos[2]);
                } else if (vetCampos[3].equals("P")) {
                    vendasPrazo += Float.parseFloat(vetCampos[2]);
                }

            }

            contador++;
        }

        arqLeitura.close();

        System.out.println("Quantidade de vendas: " + qtdVendas);
        System.out.println("Total de vendas (valor): R$" + totalVendas);
        System.out.println("Vendas a vista: R$" + vendasVista);
        System.out.println("Vendas a prazo: R$" + vendasPrazo);

    }

}
