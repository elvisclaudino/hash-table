package TabelaHash.EncadeamentoAberto;

import TabelaHash.Jogador;

public class Main {
    public static void main(String[] args) {
        int tamanhoTabela = 10; // Defina o tamanho da tabela hash

        EncadeamentoAberto tabela = new EncadeamentoAberto(tamanhoTabela);

        // Inserindo jogadores na tabela
        tabela.inserir(new Jogador(10, "Ney"));
        tabela.inserir(new Jogador(11, "Rodrygo"));
        tabela.inserir(new Jogador(7, "Vini Jr"));

        // Exibindo a tabela
        tabela.exibirTabela();

        // Buscando um jogador por chave
        int chaveBusca = 10;
        Jogador jogadorEncontrado = tabela.buscar(chaveBusca);
        if (jogadorEncontrado != null) {
            System.out.println("Jogador encontrado: " + jogadorEncontrado.getNome());
        } else {
            System.out.println("Jogador não encontrado para a chave " + chaveBusca);
        }

        // Removendo um jogador por chave
        int chaveRemover = 20;
        Jogador jogadorRemovido = tabela.remover(chaveRemover);
        if (jogadorRemovido != null) {
            System.out.println("Jogador removido: " + jogadorRemovido.getNome());
        } else {
            System.out.println("Jogador não encontrado para remover com chave " + chaveRemover);
        }

        // Exibindo a tabela após a remoção
        tabela.exibirTabela();
    }
}
