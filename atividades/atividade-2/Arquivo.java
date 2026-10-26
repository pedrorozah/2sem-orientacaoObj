import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// cria a classe para armazenar as informações dos arquivos origem e saida;

public class Arquivo {
    private BufferedWriter writer;
    private BufferedReader reader;
    private String nomeArquivo;
    private String linha;

    // ## getters e setters
    public BufferedWriter getWriter() {
        return writer;
    }

    public BufferedReader getReader() {
        return reader;
    }

    // abre pra leitura/escrita
    public void setReader() throws Exception {
        this.reader = new BufferedReader(new FileReader(this.getNomeArquivo()));
    }

    public void setWriter() throws Exception {
        this.writer = new BufferedWriter(new FileWriter(this.getNomeArquivo(), true));
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    // ## construtor
    public Arquivo(String nomeArquivo) throws Exception {
        this.nomeArquivo = nomeArquivo;
    }

    // ## métodos

    // verifica se nome já foi cadastrado
    public boolean nomeCadastrado() {
        if (this.getNomeArquivo() == null || this.getNomeArquivo().equals("")) {
            return false;
        }

        return true;
    }

    // cria arquivo e header
    public void criarArquivo(String tipo) throws Exception {

        /* Cria o arquivo com o nome já informado caso não exista */
        this.setWriter();
        this.getWriter().write("");
        this.getWriter().close();

        /*
         * // abre o leitor, lê a primeira linha se for null cria o header dependendo do
         * // tipo do arquivo (entrada/saída)
         */
        this.setReader();
        this.setLinha(this.getReader().readLine());
        this.getReader().close();

        if (this.getLinha() == null) {
            this.setWriter();

            if (tipo.equals("saída")) {
                this.getWriter().write("código;nome_produto;preço_venda");
            } else if (tipo.equals("entrada")) {
                this.getWriter().write("código;estoque;nome_produto;preço_custo;categoria");
            }

            this.getWriter().close();

        }
    }

}
