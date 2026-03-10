package br.com.fiapride.model;
 public class Lapiseira { // <-- Use o nome do SEU objeto
 // As características que você pensou
 public String material;
 public int quantidade_grafite;
 public boolean ativarBorracha;
 public double peso;
 
// construtor vazio
public Lapiseira() {

}

 public Lapiseira(String material,Double peso) {
	 this.material = material;
	 this.peso = peso;
	 this.quantidade_grafite = (int) 0.0;
 }
 
 public void carregarLapiseira(int quantia) {
	 //sistema que trata de atualizar a quantia de grafites reserva no
	 if (quantia <= 0) {
		 System.out.println("Erro: a quantia de gráfite deve ser maior que zero.");
		 return;

	 }
	 this.quantidade_grafite += quantia;
	 System.out.println("Quantia adicionada. Nova quantia: " + this.quantidade_grafite);
 }
 
 public void borrachaStatus(boolean ativarBorracha) {
	 
 }
}
