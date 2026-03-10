package br.com.fiapride.main;

 // Importamos a classe Passageiro para que o sistema a reconheça
 import br.com.fiapride.model.Lapiseira;

 public class SistemaPrincipal {
	 public static void main(String[] args) {
		 
		 Lapiseira minhaLapiseira = new Lapiseira();
		 minhaLapiseira.material = "plastico";
		 minhaLapiseira.peso = 0.25;
		 Lapiseira lapiseiraDoProfessor = new Lapiseira();
		 lapiseiraDoProfessor.material = "metalico";
		 lapiseiraDoProfessor.peso = 0.25;
		 System.out.println("Minha Lapiseira é de: " + minhaLapiseira.material);
		 System.out.println("A do professor é de: "+ lapiseiraDoProfessor.material);
	 }
	 
 }

 