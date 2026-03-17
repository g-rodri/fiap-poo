package br.com.fiapride.model;

public class Cartao {
	
	private String cor;
	private int cvc;
	private boolean status;
	private double saldo;
	private boolean movimentacao;
	
	public Cartao(String cor, int cvc, boolean status) {
		this.cor = cor;
		this.cvc = cvc;
		this.status = true;
		this.saldo = 0.00;
		this.movimentacao = false;
		
	}
	
	public double getSaldo() {
        return this.saldo; // Apenas devolve o valor, não altera nada.
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }
    
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        // Aqui você pode colocar uma regra: não pode desbloquear se houver suspeita
        if (status == true && this.movimentacao == true) {
            System.out.println("Bloqueio de segurança ativo. Fale com o gerente.");
        } else {
            this.status = status;
        }
    }

    public String getCor() {
        return this.cor;
    }

    private void setCor(String cor) {
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        }
    }
    
    public int getCvc() {
        return this.cvc;
    }

    private void setCvc(int cvc) {
        // Exemplo: CVC geralmente tem 3 dígitos (entre 100 e 999)
        if (cvc >= 100 && cvc <= 999) {
            this.cvc = cvc;
        } else {
            System.out.println("Erro: CVC inválido.");
        }
    }
    
    public boolean getMovimentacao() {
        return this.movimentacao;
    }

    private void setMovimentacao(boolean movimentacao) {
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
