package TabelaHash.EnderecamentoAberto;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.ArrayList;
import java.util.List;

public class EnderecamentoAberto extends EstruturaHash {
    private int tamanho; // tamanho da tabela
    private Jogador[] time; // vetor de jogadores

    // Construtor para inicializar a tabela hash com um tamanho específico
    public EnderecamentoAberto(int tamanho) {
        super(tamanho); // Chama o construtor da classe pai
        this.tamanho = tamanho;
        this.time = new Jogador[tamanho]; // Inicializa o vetor de jogadores
    }

    // Método para inserir um jogador na tabela hash
    public void inserir(Jogador jogador) {
        int chave = jogador.getNumeroCamisa();
        int indice = funcaoHash(chave); // Calcula o índice com base na chave do jogador

        // Implementação da estratégia de sondagem (neste caso, sondagem linear) para lidar com colisões
        while (time[indice] != null) {
            indice = (indice + 1) % tamanho; // Avança para o próximo slot
        }

        time[indice] = jogador; // Insere o jogador no slot vazio
    }

    // Método para buscar um jogador na tabela hash com base em sua chave
    public Jogador buscar(int chave) {
        int indice = funcaoHash(chave); // Calcula o índice com base na chave

        // Implementação da estratégia de sondagem para procurar o jogador
        while (time[indice] != null) {
            if (time[indice].getNumeroCamisa() == chave) {
                return time[indice]; // Retorna o jogador encontrado
            }
            indice = (indice + 1) % tamanho; // Avança para o próximo slot
        }
        return null; // Retorna nulo se o jogador não for encontrado
    }

    // Método para remover um jogador da tabela hash com base em sua chave
    public Jogador remover(int chave) {
        int indice = funcaoHash(chave); // Calcula o índice com base na chave

        // Implementação da estratégia de sondagem para localizar o jogador a ser removido
        while (time[indice] != null) {
            if (time[indice].getNumeroCamisa() == chave) {
                Jogador jogadorRemovido = time[indice]; // Armazena o jogador a ser removido
                time[indice] = null; // Remove o jogador
                return jogadorRemovido; // Retorna o jogador removido
            }
            indice = (indice + 1) % tamanho; // Avança para o próximo slot
        }
        return null; // Retorna nulo se o jogador não for encontrado para remoção
    }

    // Método para exibir a tabela hash
    public void exibirTabela() {
        System.out.println("===================================");
        System.out.println("Tabela Hash de Endereçamento Aberto:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Slot " + i + ": ");
            if (time[i] != null) {
                System.out.print(time[i].getNome() + " "); // Exibe o nome do jogador no slot
            }
            System.out.println(" ");
        }
        System.out.println("===================================");
    }
}
