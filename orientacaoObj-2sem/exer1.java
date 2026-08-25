import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exer1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tamanhoVetor = 4;
        int vetA[] = new int[tamanhoVetor];
        String vetB[] = new String[tamanhoVetor];

        System.out.println("Digite 4 valores inteiros: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetA[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("");

        System.out.println("Digite 4 nomes: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetB[i] = reader.readLine();
        }

        System.out.println("");

        for (int i = 0; i < tamanhoVetor; i++) {
            for (int j = 0; j < vetA[i]; j++) {
                System.out.println(vetB[i]);
            }
        }

    }
}
