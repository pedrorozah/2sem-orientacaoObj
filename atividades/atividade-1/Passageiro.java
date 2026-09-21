import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Passageiro {
    // atributos
    private String nome;
    private LocalDate dataNascimento;
    private String passaporte;
    private String idPassageiro;
    private int idade;

    // mostra o nome do passageiro
    public String getNome() {
        return this.nome;
    }

    // seta o nome
    public void setNome(String n) {
        this.nome = n;
    }

    // mostra o id do passageiro
    public String getIdPassageiro() {
        return this.idPassageiro;
    }

    // seta o id
    public void setIdPassageiro(String id) {
        this.idPassageiro = id;
    }

    // mostra o passaporte
    public String getPassaporte() {
        return this.passaporte;
    }

    // seta o passaporte
    public void setPassaporte(String p) {
        this.passaporte = p;
    }

    // mostra a data de nascimento
    public LocalDate getDtNascimento() {
        return this.dataNascimento;
    }

    // seta a data de nascimento
    public int setDtNascimento(String dt) {
        DateTimeFormatter formatoDt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            this.dataNascimento = LocalDate.parse(dt, formatoDt);
            return 0;
        } catch (Exception e) {
            System.out.println("Data inválida! Use o formato dd/MM/yyyy");
            return 1;
        }

    }

    // mostra a idade
    public int getIdade() {
        return this.idade;
    }

    // *** calcular idade pela data de nascimento e data atual;
    public void setIdade(LocalDate dtNascimento) {
        LocalDate hoje = LocalDate.now();

        this.idade = Period.between(dtNascimento, hoje).getYears();

    }

}
