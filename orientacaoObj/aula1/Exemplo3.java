public class Exemplo3 {
    // função principal do programa, recebe um vetor de strings "args[]"
    public static void main(String args[]) {
        // cria a variável cliente do tipo String;
        String cliente = "Pedro";
        // cria a variável do tipo Pet;
        Pet pet1 = new Pet(); // instancia um objeto da classe Pet.

        // define os valores dos atributos do obj pet1
        pet1.especie = "gato";
        pet1.nome = "Alvin";
        pet1.idade = 14;

        System.out.println("O nome do cliente é: " + cliente + ", e possui um pet chamado " + pet1.nome + ", que é "
                + pet1.especie + " e tem " + pet1.idade + " anos.");
    }
}