public class Voo {
    // atributos
    private int idVoo;
    private String origem;
    private String destino;
    private float preco;
    public Passageiro[] passageiros;

    // construtor
    public Voo(int qtdPassageiros) {
        this.passageiros = new Passageiro[qtdPassageiros];
    }

    // GETS ------------------
    public int getIdVoo() {
        return idVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public float getPreco() {
        return preco;
    }

    public Passageiro getPassageiro(int pos) {
        return this.passageiros[pos];
    }

    // SETS -----------------
    public void setIdVoo(int id) {
        this.idVoo = id;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // adiciona o passageiro a uma posição vazia;
    public void setPassageiro(Passageiro passageiro) {
        for (int i = 0; i < this.passageiros.length; i++) {
            if (this.passageiros[i] == null) {
                this.passageiros[i] = passageiro;
                break;
            }
        }
    }

}
