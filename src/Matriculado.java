import java.util.List;

public class Matriculado  {

    private Aluno aluno;
    private Disciplina disciplina;
    private int ano;
    private int Semestre;

    public Matriculado(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
        Semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }
}
