package TabelaHash.Encadeamento;
import TabelaHash.EstruturaHash;
import TabelaHash.Jogador;
import java.util.LinkedList;

public class Encadeamento extends EstruturaHash {
    private int tamanho; // tamanho da tabela
    private LinkedList<Jogador>[] time; // vetor de listas encadeadas
    private int numeroElementos; // número de elementos na tabela
    private double fatorCargaLimite = 0.7; // fator de carga limite

    public Encadeamento(int tamanho) {
        super(tamanho);
        this.tamanho = tamanho;
        this.time = new LinkedList[tamanho]; // cria o vetor de listas
        for (int i = 0; i < tamanho; i++) {
            this.time[i] = new LinkedList<>();
        }
        this.numeroElementos = 0;
    }

    public void inserir(Jogador jogador) { // insere um jogador na tabela
        int chave = jogador.getNumeroCamisa(); // chave do jogador
        int indice = funcaoHash(chave); // calcula o índice com base na chave

        if(time[indice] == null) { // verifica se a lista é nula
            time[indice] = new LinkedList<>(); // cria uma nova lista
        }

        time[indice].add(jogador); // adiciona o jogador na lista
        numeroElementos++; // incrementa o número de elementos

        if((double) numeroElementos / tamanho > fatorCargaLimite) {
            redimensionar(); // redimensiona a tabela caso o fator de carga seja maior que o limite
        }
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

    private void redimensionar() {
        int novoTamanho = tamanho * 2; // novo tamanho da tabela
        LinkedList<Jogador>[] novoTime = new LinkedList[novoTamanho]; // novo vetor de listas

        for (int i = 0; i < tamanho; i++) { // percorre o vetor de listas
            if (time[i] != null) {  // verifica se a lista não é nula
                for (Jogador jogador : time[i]) { // percorre a lista
                    int chave = jogador.getNumeroCamisa(); // chave do jogador
                    int indice = funcaoHash(chave, novoTamanho); // calcula o índice com base na chave

                    if(novoTime[indice] == null) { // verifica se a lista é nula
                        novoTime[indice] = new LinkedList<>(); // cria uma nova lista
                    }

                    novoTime[indice].add(jogador); // adiciona o jogador na lista
                }
            }
        }

        time = novoTime; // substitui o vetor de listas
        tamanho = novoTamanho; // substitui o tamanho da tabela
    }

    public void exibirTabela() { // exibe a tabela
        System.out.println("===================================");
        System.out.println("Tabela Hash de Encadeamento:");
        for (int i = 0; i < time.length; i++) { // percorre o vetor de listas
            if (time[i] != null) {
                System.out.print("Slot " + i + ": "); // exibe o slot
                for (Jogador jogador : time[i]) { // percorre a lista
                    System.out.print(jogador.getNome() + " -> "); // exibe o jogador
                }
                System.out.println(); // Move to the next line after printing the players in the slot
            }
        }
        System.out.println("===================================");
    }
}
