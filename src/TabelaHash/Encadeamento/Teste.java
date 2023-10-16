package TabelaHash.Encadeamento;

import TabelaHash.Jogador;

public class Teste {
    public static void main (String[] args) {
        Encadeamento tabelaHash = new Encadeamento(10);

        Jogador jogador1 = new Jogador(10, "Neymar");
        Jogador jogador2 = new Jogador(11, "Coutinho");
        Jogador jogador3 = new Jogador(12, "Marcelo");
        Jogador jogador4 = new Jogador(0, "João");

        tabelaHash.exibirTabela();

        tabelaHash.inserir(jogador1);
        tabelaHash.inserir(jogador2);
        tabelaHash.inserir(jogador3);
        tabelaHash.inserir(jogador4);

        tabelaHash.exibirTabela();

        Jogador busca = tabelaHash.buscar(10);

        if (busca != null) {
            System.out.println("Jogador encontrado: " + busca.getNome());
        } else {
            System.out.println("Jogador não encontrado.");
        }

        Jogador removido = tabelaHash.remover(10);

        Jogador busca3 = tabelaHash.buscar(10);

        tabelaHash.exibirTabela();
    }
}
