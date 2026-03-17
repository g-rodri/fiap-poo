package br.com.fiapride.main;

import br.com.fiapride.model.Cartao;
// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
//        // INSTANCIAÇÃO
//        // O comando 'new' aloca memória para um novo objeto.
//        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
//        System.out.println("Regarga passageiro 1");
//        passageiro1.adicionarSaldo(50.0);
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
//        System.out.println("Regarga passageiro 2");
//        passageiro2.adicionarSaldo(12.5);
//
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
//        
//        System.out.println("Pagando viagem do passageiro 1");
//        passageiro1.pagarViagem(20);
//        System.out.println("Pagando viagem do passageiro 2");
//        passageiro2.pagarViagem(20);
//
//    }
//}
		//deposito no cartão1
		Cartao cartao1 = new Cartao("Roxo", 123, true);
		System.out.println("deposito no cartão 1");
		cartao1.fazerDeposito(1000.25);
		//saque no cartão 1
		System.out.println("fazendo cobrança automatica no cartão 1 no valor predefinido");
		cartao1.fazerSaque(11.23);
		//extrato cartão 1
		cartao1.exibirExtrato();
		//bloqeuar cartao1
		cartao1.bloquearCartao(true);
		//desbloquear cartão1
		cartao1.desbloquearCartao(false);
		
		
    }
}
