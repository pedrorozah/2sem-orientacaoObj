public class Companhia {
    private String nome;
    private String telefone;
    private int id;
    private String paisOrigem;
    private Voo[] voos;

    // construtor
    public Companhia(int qtdVoos) {
        this.voos = new Voo[qtdVoos];
    }

    // GETS
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int getIdCompanhia() {
        return this.id;
    }

    public String getPaisOrigem() {
        return this.paisOrigem;
    }

    // retorna o voo na posição informada;
    public Voo getVoo(int pos) {
        return this.voos[pos];
    }

    // conta quantos voos estão cadastrados;
    public int getQtdVoos() {
        int qtdVooCadastrados = 0;

        for (int i = 0; i < voos.length; i++) {
            if (voos[i] != null) {
                qtdVooCadastrados++;
            }
        }

        return qtdVooCadastrados;
    }

    // retorna o limite de voos da companhia;
    public int getLimiteVoos() {
        return this.voos.length;
    }

    // SETS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdCompanhia(int id) {
        this.id = id;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int setVoo(Voo voo) {
        if (getQtdVoos() < voos.length) {
            for (int i = 0; i < voos.length; i++) {
                if (voos[i] == null) {
                    this.voos[i] = voo;
                    return 1;
                }
            }
        }

        return 0;
    }
}
