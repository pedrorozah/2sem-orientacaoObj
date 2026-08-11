public class Repeticao {
    public static void main(String[] args) {
        int qtde = 5;

        // repetição do tipo "for" - para
        System.out.println("--------------------------------");
        System.out.println("Repetição do tipo for");
        for (int i = 1; i <= qtde; i++)
            System.out.println(i);

        // repetição do tipo while - enquanto
        System.out.println("--------------------------------");
        System.out.println("Repetição do tipo while");
        int cont = 1;
        while (cont <= qtde) {
            System.out.println(cont);
            cont++;
        }

        // repetição do tipo do while - faça, enquanto
        System.out.println("--------------------------------");
        System.out.println("Repetição do tipo do..while");
        cont = 1;
        do {
            System.out.println(cont);
            cont++;
        } while (cont <= qtde);
    }
}
