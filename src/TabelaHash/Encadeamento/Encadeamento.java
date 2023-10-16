package TabelaHash.Encadeamento;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.LinkedList;

public class Encadeamento extends EstruturaHash {
    private int tamanho;
    private LinkedList<Jogador>[] time;
    public Encadeamento(int tamanho) {
        super(tamanho);
        this.time = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            this.time[i] = new LinkedList<>();
        }
    }

    public void inserir(Jogador jogador) {
        int chave = jogador.getNumeroCamisa();
        time[funcaoHash(chave)].add(jogador);
    }

    public Jogador buscar(int chave) {
        int chaveInt = chave;
        for (Jogador jogador : time[funcaoHash(chave)]) {
            if (jogador.getNumeroCamisa() == chaveInt) {
                return jogador;
            }
        }
        return null;
    }

    public Jogador remover(int chave) {
        for(Jogador jogador : time[funcaoHash(chave)]) {
            if(jogador.getNumeroCamisa() == chave) {
                time[funcaoHash(chave)].remove(jogador);
                return jogador;
            }
        }
        return null;
    }

    public void exibirTabela() {
        System.out.println("===================================");
        System.out.println("Tabela Hash de Encadeamento:");
        for (int i = 0; i < time.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Jogador jogador : time[i]) {
                System.out.print(jogador.getNome() + " -> ");
            }
            System.out.println("null");
        }
        System.out.println("===================================");
    }
}
