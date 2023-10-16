package TabelaHash.Encadeamento;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.LinkedList;

public class Encadeamento extends EstruturaHash {
    private int tamanho; // tamanho da tabela
    private LinkedList<Jogador>[] time; // vetor de listas encadeadas
    public Encadeamento(int tamanho) {
        super(tamanho);
        this.time = new LinkedList[tamanho]; // cria o vetor de listas
        for (int i = 0; i < tamanho; i++) {
            this.time[i] = new LinkedList<>();
        }
    }

    public void inserir(Jogador jogador) { // insere um jogador na tabela
        int chave = jogador.getNumeroCamisa(); // chave do jogador
        time[funcaoHash(chave)].add(jogador); // adiciona o jogador na lista
    }

    public Jogador buscar(int chave) { // busca um jogador na tabela
        for (Jogador jogador : time[funcaoHash(chave)]) { // percorre a lista
            if (jogador.getNumeroCamisa() == chave) { // verifica se a chave do jogador é igual a chave passada
                return jogador; // retorna o jogador
            }
        }
        return null; // retorna null caso não encontre o jogador
    }

    public Jogador remover(int chave) { // remove um jogador da tabela
        for(Jogador jogador : time[funcaoHash(chave)]) { // percorre a lista
            if(jogador.getNumeroCamisa() == chave) { // verifica se a chave do jogador é igual a chave passada
                time[funcaoHash(chave)].remove(jogador); // remove o jogador da lista
                return jogador; // retorna o jogador
            }
        }
        return null; // retorna null caso não encontre o jogador
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
