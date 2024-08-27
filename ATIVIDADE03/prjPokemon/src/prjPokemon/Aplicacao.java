package prjPokemon;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciamento de classe
		Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 1, 50);
		
		Pokemon charizard = new Pokemon("Charizard", "Fogo", 1, 50);
		
		Pokemon metapod = new Pokemon("Metapod", "Folha", 1, 50);
		
		Pokemon blastoise = new Pokemon("Blastoise", "Agua", 1, 50);
		
		Pokemon pidgey = new Pokemon("Pidgey", "Comum", 1, 50);
		
		pikachu.exibirinfo();
		pikachu.evoluir();
		pikachu.atacar();

		charizard.exibirinfo();
		charizard.evoluir();
		charizard.atacar();
		
		metapod.exibirinfo();
		metapod.evoluir();
		metapod.atacar();
		
		blastoise.exibirinfo();
		blastoise.evoluir();
		blastoise.atacar();

		pidgey.exibirinfo();
		pidgey.evoluir();
		pidgey.atacar();
		
	}

}	
		
		
		
		
			
		
			


