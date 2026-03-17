package br.com.fiapride.model;

public class Cartao {
	
	public String cor;
	public int cvc;
	public boolean status;
	public double saldo;
	public boolean movimentacao;
	
	public Cartao(String cor, int cvc, boolean status) {
		this.cor = cor;
		this.cvc = cvc;
		this.status = true;
		this.saldo = 0.00;
		this.movimentacao = false;
		
	}

	public void fazerSaque(double valor) {
		if (valor <= 0) {
            System.out.println("Erro: valor insuficiente.");
            return;
        }
		if (valor >= 400.00) {
			this.movimentacao = true;
		}
        this.saldo -= valor;
        System.out.println("Saque realizado ");
    }
	
	public void exibirExtrato() {
		System.out.println("Seu extrato atual é: "+ this.saldo);
	}
	
	public void fazerDeposito(double valor) {
		if (valor <= 0) {
            System.out.println("Erro: valor insuficiente.");
            return;
		}
		if (valor >= 900.00) {
			this.movimentacao = true;
		}
		this.saldo += valor;
		System.out.println("Você depositou: " +valor);
	}
	
	public void bloquearCartao(boolean movimentacao) {
		if (movimentacao == true) {
			System.out.println("Alerta: seu histórico de operações recentes demonstra comportamento suspeito. Bloqueando Cartão");
		}
		this.status = false;
		System.out.println("Status do cartão : "+this.status);
	}
	
	public void desbloquearCartao(boolean situacao) {
		if (status == false) {
			System.out.println("desbloqueando cartão");
		}
		this.status = true;
		System.out.println("Status do cartão : "+this.status);
	}
}
