
public class Livro {

	private String titulo;
	private boolean emprestado;

	public Livro(String titulo, boolean emprestado) {
		setTitulo(titulo);
		setEmprestado(emprestado);
	}

	/**
	 * Realiza o empréstimo do livro.
	 *
	 * @throws IllegalArgumentException se o livro já estiver emprestado
	 */
	public void emprestarLivro() {
		if (emprestado) {
			throw new IllegalArgumentException("Livro já está emprestado");
		}
		emprestado = true;
	}

	/**
	 * Registra a devolução do livro.
	 *
	 * @throws IllegalArgumentException se o livro não estiver emprestado
	 */
	public void devolverLivro() {
		if (!emprestado) {
			throw new IllegalArgumentException("Livro está em estoque");
		}
		emprestado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("Título inválido");
		}
		this.titulo = titulo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	/**
	 * Retorna uma representação textual do livro.
	 *
	 * @return uma string indicando o título e o estado de empréstimo
	 */
	@Override
	public String toString() {
		if (emprestado) {
			return "O livro: " + titulo + " está emprestado";
		}
		return "O livro: " + titulo + " não está emprestado";
	}
}
