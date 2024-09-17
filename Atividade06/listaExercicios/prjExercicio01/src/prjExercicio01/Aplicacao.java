package prjExercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		Carro carro1 = new Carro ();
		carro1.modelo = "Celta";
		carro1.marca = "Chevrolet";
		carro1.placa = "MHR7S99";
		carro1.ano = 2010;
		
		Carro carro2 = new Carro ("Uno", "Fiat", "GBH8I88", 2015);
		
		carro1.exibirInfo();
		carro1.modeloCarro();
		carro1.marcaCarro();
		carro1.placaCarro();
		carro1.anoCarro();
		carro1.exibirInfo();
		
		carro2.exibirInfo();
		carro2.modeloCarro();
		carro2.marcaCarro();
		carro2.placaCarro();
		carro2.anoCarro();
		carro2.exibirInfo();
		
				
				
		

	}

}
