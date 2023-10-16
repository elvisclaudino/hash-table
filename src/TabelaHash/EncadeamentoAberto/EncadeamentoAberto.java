package TabelaHash.EncadeamentoAberto;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.LinkedList;

public class EncadeamentoAberto extends EstruturaHash {
    private int tamanho; // tamanho da tabela
    private LinkedList<Jogador>[] time; // vetor de listas encadeadas

    public EncadeamentoAberto(int tamanho) {
        super(tamanho);
        this.time = new LinkedList[tamanho]; // cria o vetor de listas
        for (int i = 0; i < tamanho; i++) {
            this.time[i] = new LinkedList<>();
        }

    }
    public void inserir(Jogador jogador) { // insere um jogador na tabela
        int chave = jogador.getNumeroCamisa();
        int indice = funcaoHash(chave); // Calcula o índice de hash
        if (time[indice] == null) {
            time[indice] = new LinkedList<>(); // Inicializa uma lista encadeada se ainda não existir
        }
        time[indice].add(jogador);
    }

    public Jogador buscar(int chave) {
        int indice = funcaoHash(chave);
        if (time[indice] != null) {
            for (Jogador jogador : time[indice]) {
                if (jogador.getNumeroCamisa() == chave) {
                    return jogador;
                }
            }
        }
        return null;
    }

    public Jogador remover(int chave) { // remove um jogador da tabela
        int indice = funcaoHash(chave);
        if (time[indice] != null) {
            for (Jogador jogador : time[indice]) {
                if (jogador.getNumeroCamisa() == chave) {
                    time[indice].remove(jogador);
                    return jogador;
                }
            }
        }
        return null;
    }
    public void exibirTabela() { // exibe a tabela
        System.out.println("===================================");
        System.out.println("Tabela Hash de Encadeamento:");
        for (int i = 0; i < time.length; i++) { // percorre o vetor de listas
            System.out.print("Slot " + i + ": "); // exibe o slot
            for (Jogador jogador : time[i]) { // percorre a lista
                System.out.print(jogador.getNome() + " -> "); // exibe o jogador
            }
            System.out.println("null"); // exibe null caso a lista esteja vazia
        }
        System.out.println("===================================");
    }



}
