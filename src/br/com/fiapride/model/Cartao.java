
public class Cartao {
	
	private String cor;
	private int cvc;
	private boolean status;
	private double saldo;
	private boolean movimentacao;
	
// O CONSTRUTOR de cartão
    public Cartao(String cor, int cvc, boolean status) {
        System.out.println("💳 Iniciando a fabricação de um novo cartão...");
        
        // 1. Recebendo as 3 informações do teste e validando
        this.setCor(cor);
        this.setCvc(cvc);
        this.status = status; // Define o status inicial (true = ativo, false = bloqueado)
        
        // 2. Valores Padrão (O que não vem no () do construtor)
        this.saldo = 0.0;
        this.movimentacao = false; 
        
        System.out.println("✅ Cartão " + this.getCor() + " fabricado com sucesso!");
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

    private void setStatus(boolean status) {
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

	private void setMovimentacao(int movimentacao boolean) {

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

	public void exibirExtrato(double valor) {

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

	public void desbloquearCartão(boolean movimentacao) {

	}
}
