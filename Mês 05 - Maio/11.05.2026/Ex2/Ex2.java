
public class Ex2 {

	public static void main(String[] args) {

		Flor f1 = new Flor("Girassol", 10, "João");
		Flor f2 = new Flor("Rosa", 15, "Maria");
		Flor f3 = new Flor("Orquídea", 12, "Ana");
		Flor f4 = new Flor("Tulipa", 20, "Gabriel");
		Flor f5 = new Flor("Margarida", 9, "João");

		Floricultura floricultura = new Floricultura();

		floricultura.adicionarFlor(f1);
		floricultura.adicionarFlor(f2);
		floricultura.adicionarFlor(f3);
		floricultura.adicionarFlor(f4);
		floricultura.adicionarFlor(f5);

		System.out.println(floricultura.obterFlores("João"));

	}

}
