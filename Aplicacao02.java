package prjCaneta;

public class Aplicacao02 {

	public static void main(String[] args) {
		Livro livro01 = new Livro("Alice no pais";"Julio Trigueiro");
		Livro livro02 = new Livro("Quarto de despejo";"Pedro Francisco");
		
System.out.println("Livros disponiveis");
livro01.status();
livro02.status();
	}

}
