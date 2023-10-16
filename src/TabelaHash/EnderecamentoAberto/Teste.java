package TabelaHash.EnderecamentoAberto;

import TabelaHash.Jogador;

public class Teste {
    public static void main(String[] args) {
        int tamanhoTabela = 10; // Defina o tamanho da tabela hash

        EnderecamentoAberto tabela = new EnderecamentoAberto(tamanhoTabela);

        // Inserindo jogadores na tabela
        tabela.inserir(new Jogador(10, "Ney"));
        tabela.inserir(new Jogador(11, "Rodrygo"));
        tabela.inserir(new Jogador(7, "Vini Jr"));
        tabela.inserir(new Jogador(0, "Bruno"));


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
        int chaveRemover = 10;
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
