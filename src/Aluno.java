public class Aluno extends Pessoa{

    private String nome;

    private int matricula;

    public Aluno(String nome, int matricula, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
