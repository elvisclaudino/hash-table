package TabelaHash.TesteEficiencia;

import TabelaHash.Encadeamento.Encadeamento;
import TabelaHash.EnderecamentoAberto.EnderecamentoAberto;
import TabelaHash.Jogador;
import TabelaHash.Metodos;

import java.util.Random;

public class TesteEficiencia {
    public static void main(String[] args) {
        int tamanhoTabela = 1000; // Tamanho da tabela hash
        int numElementos = 500;   // Número de elementos a serem inseridos na tabela

        Encadeamento encadeamento = new Encadeamento(tamanhoTabela); // Cria a tabela hash com encadeamento
        EnderecamentoAberto enderecamentoAberto = new EnderecamentoAberto(tamanhoTabela); // Cria a tabela hash com endereçamento aberto

        populaTabela(encadeamento, numElementos); // Popula a tabela hash com encadeamento
        populaTabela(enderecamentoAberto, numElementos); // Popula a tabela hash com endereçamento aberto

        testarEficiencia(encadeamento, "Encadeamento"); // Testa a eficiência da tabela hash com encadeamento
        testarEficiencia(enderecamentoAberto, "Endereçamento aberto"); // Testa a eficiência da tabela hash com endereçamento aberto
    }
    public static void populaTabela(Metodos tabela, int numElementos) { // Popula a tabela hash com jogadores aleatórios
        Random rand = new Random(); // Gera números aleatórios
        for(int i = 0; i<numElementos; i++) {
            int chave = rand.nextInt(10000); // Gera uma chave aleatória entre 0 e 9999
            Jogador jogador = new Jogador(chave, "Jogador" + i); // Cria um jogador com dados aleatórios
            tabela.inserir(jogador); // Insere o jogador na tabela hash
        }
    }

    public static void testarEficiencia(Metodos tabela, String nomeEstrutura) { // Testa a eficiência da tabela hash
        int numTestes = 1000; // Número de testes a serem realizados
        Random rand = new Random(); // Gera números aleatórios

        long startTime = System.nanoTime(); // Tempo inicial
        for (int i = 0; i < numTestes; i++) { // Realiza os testes
            int chave = rand.nextInt(10000); // Gera uma chave aleatória entre 0 e 9999
            tabela.buscar(chave); // Busca um jogador na tabela hash
        }

        long endTime = System.nanoTime(); // Tempo final
        long tempoMedio = (endTime - startTime) / numTestes; // Tempo médio de busca

        System.out.println("Tempo médio de busca na tabela hash com " + nomeEstrutura + ": " + tempoMedio + "ms");
    }
}
