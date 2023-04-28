import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {
    private String nome;
    private int duracao;
    private List<Disciplina> disciplinas;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }


    public List<Aluno> obterAlunosDoCurso() {
        List<Aluno> alunosDoCurso = new ArrayList<>();
        for (Disciplina disciplina : disciplinas) {
            alunosDoCurso.addAll(disciplina.obterAlunosMatriculados());
        }
        return alunosDoCurso;
    }

    public Map<Aluno, List<Disciplina>> obterDisciplinasPorAluno(int ano, int semestre) {
        Map<Aluno, List<Disciplina>> disciplinasPorAluno = new HashMap<>();
        for (Disciplina disciplina : disciplinas) {
            List<Matriculado> matriculados = disciplina.obterMatriculadosPorSemestre(ano, semestre);
            for (Matriculado matriculado : matriculados) {
                Aluno aluno = matriculado.getAluno();
                if (!disciplinasPorAluno.containsKey(aluno)) {
                    disciplinasPorAluno.put(aluno, new ArrayList<>());
                }
                disciplinasPorAluno.get(aluno).add(disciplina);
            }
        }
        return disciplinasPorAluno;
    }
    public void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        // cria um objeto Matricula para registrar a matrícula do aluno na disciplina
        Matriculado matricula = new Matriculado(aluno, disciplina, ano, semestre);

        // adiciona a matrícula na lista de matrículas da disciplina
        disciplina.adicionarMatriculado(matricula);

        // adiciona a disciplina na lista de disciplinas do aluno
        adicionarDisciplina(disciplina);

        // adiciona o aluno na lista de alunos matriculados no curso
        if (!obterAlunosDoCurso().contains(aluno)) {
            obterAlunosDoCurso().add(aluno);
        }
    }

}