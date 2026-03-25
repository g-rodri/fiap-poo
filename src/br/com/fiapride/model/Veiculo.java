package br.com.fiapride.model;

public class Veiculo {

	private String placa;

	private String modelo;

	public Veiculo(String placa, String modelo) {
		this.setPlaca(placa);
		this.modelo = modelo;
		System.out.println("registro inicial: Um " + this.modelo + "nasceu com a placa " + this.placa);
	}

	public String getPlaca() {
		return this.placa;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void atualiazarPlaca(String novaPlaca) {
		System.out.println(" Solicitada atualizações de placa no detran para o veiculo " + this.modelo + "...");
		this.setPlaca(novaPlaca);
	}

	private void setPlaca(String novaPlaca) {
		if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
			this.placa = novaPlaca;
			System.out.println("Sucesso: a placa agora é " + this.placa);
		} else {
			System.out.println("Erro de Validação: A placa informada é inválida!");
		}
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
