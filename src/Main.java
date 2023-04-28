import java.util.List;

public class Main {
    public static void main(String[] args) {
        // cria um curso
        Curso curso = new Curso("Ciência da Computação", 4);

        // cria algumas disciplinas e adiciona ao curso
        Disciplina prog1 = new Disciplina("Programação 1");
        Disciplina prog2 = new Disciplina("Programação 2");
        curso.adicionarDisciplina(prog1);
        curso.adicionarDisciplina(prog2);

        // cria alguns alunos
        Aluno aluno1 = new Aluno("João", 1, "rua", "9999999", "email");
        Aluno aluno2 = new Aluno("Maria", 2, "rua2", "99999992", "email2");
        Aluno aluno3 = new Aluno("Lucas", 3, "rua3", "99999993", "email3");
        Aluno aluno4 = new Aluno("Pedro", 4, "ru4", "99999994", "email4");

        // matricula os alunos em algumas disciplinas
        curso.matricularAlunoEmDisciplina(aluno1, prog1, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno2, prog2, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno3, prog2, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno4, prog1, 2023, 1);

        // obtém a lista de alunos matriculados no curso
        List<Aluno> alunosMatriculados = curso.obterAlunosDoCurso();

        // imprime a lista de alunos matriculados
        System.out.println("Alunos matriculados no curso:");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
        // obtém a lista de alunos matriculados na disciplina de programação 2
        List<Aluno> alunosMatriculadosProg2 = prog2.obterAlunosMatriculados();

        // imprime a lista de alunos matriculados na disciplina de programação 2
        System.out.println("\nAlunos matriculados na disciplina de programação 2:");
        for (Aluno aluno : alunosMatriculadosProg2) {
            System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }
}
