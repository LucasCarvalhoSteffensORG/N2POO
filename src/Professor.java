public class Professor extends Pessoa {

    private String titulacao;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;


    public Professor(String nome, String endereco, String telefone, String email, String titulacao, String nome1, String endereco1, String telefone1, String email1) {
        super(nome, endereco, telefone, email);
        this.titulacao = titulacao;
        this.nome = nome1;
        this.endereco = endereco1;
        this.telefone = telefone1;
        this.email = email1;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
