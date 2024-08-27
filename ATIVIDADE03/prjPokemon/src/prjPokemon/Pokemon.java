package prjPokemon;

public class Pokemon {
	
	//Atributos
	String nome;
	String tipo;
	double nivel;
	int hp;
	
	//Construtores
	Pokemon() {
	}
	
	public Pokemon(String nome, String tipo, double nivel, int hp) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.hp = hp;
	}
	//Metodos
	void atacar() {
        System.out.println(nome + " atacou!");
    }
    void evoluir() {
        System.out.println(nome + " esta em evolucao!");
        System.out.println(nome + " evoluiu!");
    }
    void exibirinfo(){
        System.out.println();
	System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nível: " + this.nivel);
        System.out.println("HP: " + this.hp);
    }
}