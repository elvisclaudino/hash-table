package TabelaHash.EnderecamentoAberto;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.ArrayList;
import java.util.List;

public class EnderecamentoAberto extends EstruturaHash {
    private int tamanho; // tamanho da tabela
    private Jogador[] time; // vetor de jogadores

    public EnderecamentoAberto(int tamanho) {
        super(tamanho);
        this.tamanho = tamanho;
        this.time = new Jogador[tamanho];
    }

    public void inserir(Jogador jogador) {
        int chave = jogador.getNumeroCamisa();
        int indice = funcaoHash(chave);

        while (time[indice] != null) {
            // Implementação da estratégia de sondagem (neste caso, sondagem linear)
            indice = (indice + 1) % tamanho;
        }

        time[indice] = jogador;
    }

    public Jogador buscar(int chave) {
        int indice = funcaoHash(chave);
        while (time[indice] != null) {
            if (time[indice].getNumeroCamisa() == chave) {
                return time[indice];
            }
            indice = (indice + 1) % tamanho;
        }
        return null;
    }

    public Jogador remover(int chave) {
        int indice = funcaoHash(chave);
        while (time[indice] != null) {
            if (time[indice].getNumeroCamisa() == chave) {
                Jogador jogadorRemovido = time[indice];
                time[indice] = null;
                return jogadorRemovido;
            }
            indice = (indice + 1) % tamanho;
        }
        return null;
    }

    public void exibirTabela() {
        System.out.println("===================================");
        System.out.println("Tabela Hash de Endereçamento Aberto:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Slot " + i + ": ");
            if (time[i] != null) {
                System.out.print(time[i].getNome() + " ");
            }
            System.out.println(" ");
        }
        System.out.println("===================================");
    }
}
