import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Matriculado> matriculados;

    public Disciplina(String nome) {
        this.nome = nome;
        this.matriculados = new ArrayList<>();
    }

    public void adicionarMatriculado(Matriculado matriculado) {
        this.matriculados.add(matriculado);
    }

    public List<Matriculado> getMatriculados() {
        return matriculados;
    }

    public List<Aluno> obterAlunosMatriculados() {
        List<Aluno> alunosMatriculados = new ArrayList<>();
        for (Matriculado matriculado : matriculados) {
            alunosMatriculados.add(matriculado.getAluno());
        }
        return alunosMatriculados;
    }

    public List<Matriculado> obterMatriculadosPorSemestre(int ano, int semestre) {
        List<Matriculado> matriculadosPorSemestre = new ArrayList<>();
        for (Matriculado matriculado : matriculados) {
            if (matriculado.getAno() == ano && matriculado.getSemestre() == semestre) {
                matriculadosPorSemestre.add(matriculado);
            }
        }
        return matriculadosPorSemestre;
    }


}
