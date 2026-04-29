package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        
        // TESTE 1: A forma correta (Nascimento legalizado)        
        Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
        
        // TESTE 2: Tentando burlar o sistema (Descomente a linha abaixo)
        // Veiculo carroFantasma = new Veiculo();         
        // 🛑 ERRO DE COMPILAÇÃO! 
        // O Java vai sublinhar de vermelho e dizer: "The constructor Veiculo() is undefined".
       // Por quê? Porque assim que você cria um construtor com regras, 
       // o Java DESTRÓI aquele construtor vazio padrão. Você é obrigado a passar a placa!
   }
}