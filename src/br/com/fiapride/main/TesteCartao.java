package br.com.fiapride.main;

import br.com.fiapride.model.Cartao;

public class TesteCartao {

    public static void main(String[] args) {
        // 1. Instalação e Verificação Inicial
        Cartao cartao1 = new Cartao("Roxo", 123, true);
        System.out.println("--- Início dos Testes ---");
        System.out.println("Cor original: " + cartao1.getCor());

        // 2. Testando Depósito com Alerta de Movimentação
        System.out.println("\n[Teste Depósito Alto]");
        cartao1.fazerDeposito(1000.00); // Deve ativar 'movimentacao' (>= 900)
        cartao1.exibirExtrato();

        // 3. Testando Saque e Saldo
        System.out.println("\n[Teste Saque]");
        cartao1.fazerSaque(100.00);
        cartao1.exibirExtrato();

        // 4. Testando Bloqueio por Movimentação Suspeita
        // Como o depósito foi de 1000, a flag movimentacao está true
        System.out.println("\n[Teste Segurança]");
        cartao1.bloquearCartao(cartao1.getMovimentacao()); 
        
        // Verificando se o status realmente mudou para false
        System.out.println("O cartão está ativo? " + cartao1.getStatus());

        // 5. Tentativa de burlar as regras (Testando os SETS que criamos)
        System.out.println("\n[Teste de Proteção de Dados]");
        // Se você seguiu o exemplo anterior com os sets privados/protegidos:
        // cartao1.setSaldo(-500); // Isso deve dar erro de compilação ou ser ignorado
        
        // 6. Testando Desbloqueio
        System.out.println("\n[Teste Desbloqueio]");
        cartao1.desbloquearCartao(true);
        System.out.println("Status final: " + cartao1.getStatus());
        
        System.out.println("\n--- Fim dos Testes ---");
        
        
      //deposito no cartão1

        Cartao cartao2 = new Cartao("Azul", 345, true);

        System.out.println("deposito no cartão 2");

        cartao2.fazerDeposito(200.25);

        //saque no cartão 1

        System.out.println("fazendo cobrança automatica no cartão 2 no valor predefinido");

        cartao2.fazerSaque(11.23);

        //extrato cartão 1

        cartao2.exibirExtrato();

        //bloqeuar cartao1

        cartao2.bloquearCartao(true);

        //desbloquear cartão1

        cartao2.desbloquearCartao(false);



        }

}
