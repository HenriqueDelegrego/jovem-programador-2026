
public class Ex3 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Henrique", 24, "61641", "PJP", 8.9);
		Aluno a2 = new Aluno("Ana", 20, "9848941", "Entra21", 8.4);
		Aluno a3 = new Aluno("João", 30, "848", "ADS", 8.2);
		Aluno a4 = new Aluno("Maria", 26, "96651", "PJP", 8.6);

		SistemaAlunos s1 = new SistemaAlunos();

		s1.adicionarAluno(a1);
		s1.adicionarAluno(a2);
		s1.adicionarAluno(a3);
		s1.adicionarAluno(a4);

		System.out.println(s1.obterAlunoCursoIdadeEMedia("Entra21", 25, 8));

		s1.obterAlunoPorMatricula("1").setMatricula("2");

	}
}
