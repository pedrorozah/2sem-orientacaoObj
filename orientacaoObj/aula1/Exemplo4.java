public class Exemplo4 {

    public static void mostrarInformacoes(String cliente, Pet pet) {
        System.out.println("O nome do cliente é: " + cliente + ", e possui um pet chamado " + pet.nome + ", que é "
                + pet.especie + " e tem " + pet.idade + " anos.\n");
    }

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

        Pet pet2 = new Pet();
        pet2.especie = "cachorro";
        pet2.nome = "Dog";
        pet2.idade = 30;

        mostrarInformacoes(cliente, pet1);
        mostrarInformacoes(cliente, pet2);
    }

}