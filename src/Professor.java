public class Professor extends Pessoa {

    private String titulacao;

    public Professor(String nome, String titulacao, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
