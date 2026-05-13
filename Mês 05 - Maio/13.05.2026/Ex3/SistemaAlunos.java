import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

	private List<Aluno> listaAlunos;

	public SistemaAlunos() {
		listaAlunos = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno a) {
		listaAlunos.add(a);
	}

	/**
	 * Pesquisa alunos utilizando três critérios:
	 * <ul>
	 * <li>curso igual ao informado</li>
	 * <li>idade maior ou igual à informada</li>
	 * <li>média final maior ou igual à informada</li>
	 * </ul>
	 * 
	 * Apenas os alunos que atenderem simultaneamente aos três critérios serão
	 * adicionados na lista de resultado.
	 * 
	 * @param curso curso desejado
	 * @param idade idade mínima desejada
	 * @param media média final mínima desejada
	 * 
	 * @return lista contendo os alunos encontrados. Caso nenhum aluno satisfaça os
	 *         critérios, será retornada uma lista vazia.
	 */
	public List<Aluno> obterAlunoCursoIdadeEMedia(String curso, int idade, double media) {

		List<Aluno> listaPesquisa = new ArrayList<Aluno>();

		for (Aluno a : listaAlunos) {
			if (a.getCurso().equals(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media) {
				listaPesquisa.add(a);
			}
		}

		return listaPesquisa;
	}

	/**
	 * Procura um aluno utilizando sua matrícula.
	 * 
	 * O método percorre toda a lista de alunos até encontrar um aluno cuja
	 * matrícula seja igual à informada.
	 * 
	 * Caso o aluno seja encontrado, o objeto Aluno correspondente é retornado
	 * imediatamente.
	 * 
	 * Caso nenhum aluno possua a matrícula informada, o método retorna
	 * {@code null}.
	 * 
	 * Retornar {@code null} pode ser perigoso porque o código que chamar este
	 * método pode tentar acessar métodos ou atributos do objeto retornado sem
	 * verificar antes se ele realmente existe.
	 * 
	 * Se nenhum aluno for encontrado, {@code a} será {@code null} e a chamada
	 * {@code a.getNome()} provocará um {@link NullPointerException}.
	 * 
	 * @param matricula matrícula do aluno a ser pesquisado
	 * 
	 * @return o aluno encontrado ou {@code null} caso a matrícula não exista no
	 *         sistema
	 */
	public Aluno obterAlunoPorMatricula(String matricula) {

		for (Aluno a : listaAlunos) {
			if (a.getMatricula().equals(matricula)) {
				return a;
			}
		}

		return null;

	}

}
