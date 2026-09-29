import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ExemploVet1
 */
public class ExemploVet1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int num = -1;
        Meses meses = new Meses();
        while (num != 0) {
            System.out.println("Informe o número do mes ou 0 para sair");
            // método readline retorn String, portanto convertemos com parseInt.
            num = Integer.parseInt(reader.readLine());
            String mes = meses.pegarNomeMes(num);
            if (!mes.equals("")) {
                System.out.println("O mês é: " + mes);
            } else if (num == 0) {
                System.out.println("Encerrando programa...!");
            } else
                System.out.println("Valor inválido!");

        }
    }

}