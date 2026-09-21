import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    BufferedReader reader;
    Companhia companhia;

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.reader = new BufferedReader(new InputStreamReader(System.in));
        int qtdVoos;

        System.out.println("##### CADASTRO DA COMPANHIA AÉREA ####");

        do {
            System.out.println("\nQuantos voos deseja cadastrar no máximo? (1 a 10)");
            qtdVoos = Integer.parseInt(m.reader.readLine());
        } while (qtdVoos < 1 || qtdVoos > 10);

        m.companhia = new Companhia(qtdVoos);

        // cadastra informações da companhia
        System.out.println("\nDigite o nome da companhia: ");
        m.companhia.setNome(m.reader.readLine());

        System.out.println("\nDigite o telefone da companhia: ");
        m.companhia.setTelefone(m.reader.readLine());

        System.out.println("\nDigite o país de origem da companhia:");
        m.companhia.setPaisOrigem(m.reader.readLine());

        m.mostrarMenu();
    }

    private void mostrarMenu() throws Exception {
        String opcao = "";
        boolean flag_cadastro = false;
        while (!opcao.equals("4")) {
            System.out.println("\n-------- SISTEMA DE GERENCIAMENTO DE VOOS INTERNACIONAIS --------");
            System.out.println("[1] Cadastrar novo Voo");
            System.out.println("[2] Listar Voos existentes");
            System.out.println("[3] Consultar uma voo específico");
            System.out.println("[4] Sair");
            System.out.println("--------------------------------------------");

            System.out.println();
            System.out.println("Digite uma opção:");
            opcao = this.reader.readLine();

            switch (opcao) {
                case "1":
                    // cadastrar voo , atualiza a flag cadastro3
                    if (cadastrarVoo())
                        flag_cadastro = true;
                    break;
                case "2":
                    if (flag_cadastro) {
                        listarTodosVoos();
                    } else {
                        System.out.println("\n### CADASTRE UM VOO PRIMEIRO ###\n");
                    }

                    break;
                case "3":
                    // consultar voo específico
                    if (flag_cadastro) {
                        consultarVoo();
                    } else {
                        System.out.println("\n### CADASTRE UM VOO PRIMEIRO ###\n");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    // FUNÇÃO DE CADASTRO DE VOO
    private boolean cadastrarVoo() throws Exception {
        // cadastra as informações do VOO

        // verifica se a companhia já atingiu o limite de voos, se sim, não permite
        // cadastra mais voos
        if (companhia.getQtdVoos() >= companhia.getLimiteVoos()) {
            System.out.println("\n### LIMITE DE VOOS ATINGIDO ###\n");
            return false;
        }

        int qtdPassageiros;

        System.out.println("\n------- CADASTRO DE VOO --------");

        do {
            System.out.println("\nQual a capacidade de passageiros do voo? (1 a 50)");
            qtdPassageiros = Integer.parseInt(reader.readLine());
        } while (qtdPassageiros < 1 || qtdPassageiros > 50);

        Voo voo = new Voo(qtdPassageiros);
        int flag = 0;

        System.out.println("\nDigite o país de origem:");
        voo.setOrigem(reader.readLine());

        System.out.println("\nDigite o país de destino:");
        voo.setDestino(reader.readLine());

        System.out.println("\nDigite o ID do VOO:");
        voo.setIdVoo(Integer.parseInt(reader.readLine()));

        do {
            System.out.println("\nDigite o valor base da passagem:");
            voo.setPreco(Float.parseFloat(reader.readLine()));

            if (voo.getPreco() <= 0) {
                System.out.println("***Digite um valor maior que 0.\n");
                flag = 1;
            } else {
                flag = 0;
            }

        } while (flag == 1);
        // ---------------

        // cadastra os passageiros individualmente
        System.out.println("\n------- PASSAGEIROS ----------");

        do {
            System.out.println("\nQuantos passageiros deseja adicionar? (1 a "
                    + voo.passageiros.length + ")");
            qtdPassageiros = Integer.parseInt(reader.readLine());

        } while (qtdPassageiros <= 0 || qtdPassageiros > voo.passageiros.length);

        for (int i = 0; i < qtdPassageiros; i++) {
            Passageiro passageiro = new Passageiro();

            System.out.println("\n##PASSAGEIRO " + (i + 1) + ":");

            System.out.println("\nDigite o nome do passageiro:");
            passageiro.setNome(reader.readLine());

            do {
                System.out.println("\nDigite a data de nascimento (dd/mm/yyyy):");
            } while (passageiro.setDtNascimento(reader.readLine()) == 1);

            System.out.println("\nDigite o passaporte do passageiro:");
            passageiro.setPassaporte(reader.readLine());

            System.out.println("\nDigite o ID do passageiro:");
            passageiro.setIdPassageiro(reader.readLine());

            passageiro.setIdade(passageiro.getDtNascimento());

            // armazena o passageiro no voo
            voo.setPassageiro(passageiro);
        }

        companhia.setVoo(voo);
        return true;
    }

    // FUNÇÃOES DE VOOS
    private void listarTodosVoos() {
        System.out.println("\n------- LISTA DE VOOS --------\n");

        for (int i = 0; i < companhia.getQtdVoos(); i++) {
            Voo voo = companhia.getVoo(i);
            System.out.println("###### VOO " + (i + 1) + " ###########");
            System.out.println("ID: " + voo.getIdVoo());
            System.out.println("Origem: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Preço base da passagem: R$" + voo.getPreco());

            int assentosLivres = 0;
            System.out.println("\n** PASSAGEIROS **");
            for (int pos = 0; pos < voo.passageiros.length; pos++) {
                Passageiro passageiro = voo.getPassageiro(pos);
                if (passageiro == null) {
                    assentosLivres++;
                } else {
                    System.out.println();
                    exibirPassageiro(passageiro, pos);
                }
            }

            System.out.println("\n** Assentos livres: " + assentosLivres);
            System.out.println();
        }
    }

    // FUNÇÃO DE CONSULTA DE VOO ESPECÍFICO
    private void consultarVoo() throws Exception {
        System.out.println("\n------- CONSULTA DE VOO --------\n");
        System.out.println("Digite o ID do voo que deseja consultar:");
        int idVoo = Integer.parseInt(reader.readLine());

        for (int i = 0; i < companhia.getQtdVoos(); i++) {
            Voo voo = companhia.getVoo(i);
            if (voo.getIdVoo() == idVoo) {
                System.out.println("\nINFORMAÇÕES DO VOO " + (i + 1) + " ------------ ");
                System.out.println("ID: " + voo.getIdVoo());
                System.out.println("Origem: " + voo.getOrigem());
                System.out.println("Destino: " + voo.getDestino());
                System.out.println("Preço base da passagem: R$" + voo.getPreco());

                int assentosLivres = 0;
                System.out.println("\n------ PASSAGEIROS ------\n");
                for (int pos = 0; pos < voo.passageiros.length; pos++) {
                    Passageiro passageiro = voo.getPassageiro(pos);
                    if (passageiro == null) {
                        assentosLivres++;
                    } else {
                        System.out.println();
                        exibirPassageiro(passageiro, pos);
                    }
                }

                System.out.println("\n ** Assentos livres: " + assentosLivres + "\n");
                return;
            }
        }
        System.out.println("\n### VOO NÃO ENCONTRADO ###.\n");
    }

    // FUNÇÃO DE EXIBIÇÃO DE PASSAGEIRO
    private void exibirPassageiro(Passageiro passageiro, int pos) {
        System.out.println("## Passageiro " + (pos + 1) + " ##\n");
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Data de nascimento: " + passageiro.getDtNascimento());
        System.out.println("Idade: " + passageiro.getIdade());
        System.out.println("Passaporte: " + passageiro.getPassaporte());
        System.out.println("ID: " + passageiro.getIdPassageiro());
    }
}