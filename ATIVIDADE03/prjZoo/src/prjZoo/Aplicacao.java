package prjZoo;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		
		ClasseAnimal girafa = new ClasseAnimal("Github","Russa","Femea",90);
		
		SubClasseCarnivora leao = new SubClasseCarnivora();
		leao.atributoNome = "Leaondro";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Femea";
		leao.atributoPeso = 123;
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
		
		elefante.exibirInfo();
		
	girafa.exibirInfo();
		
			
		
			
		
			
		

	}

}
