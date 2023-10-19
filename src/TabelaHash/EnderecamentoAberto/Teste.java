package TabelaHash.EnderecamentoAberto;

import TabelaHash.Jogador;

public class Teste {
    public static void main(String[] args) {
        int tamanhoTabela = 10; // Defina o tamanho da tabela hash

        EnderecamentoAberto tabelaHash = new EnderecamentoAberto(tamanhoTabela);

        // Inserindo jogadores na tabela
        tabelaHash.inserir(new Jogador(1, "Alisson"));
        tabelaHash.inserir(new Jogador(2, "Danilo"));
        tabelaHash.inserir(new Jogador(3, "T. Silva"));
        tabelaHash.inserir(new Jogador(4, "Marquinhos"));
        tabelaHash.inserir(new Jogador(5, "Casemiro"));
        tabelaHash.inserir(new Jogador(7, "L. Paquetá"));
        tabelaHash.inserir(new Jogador(8, "Fred"));
        tabelaHash.inserir(new Jogador(9, "Richarlison"));
        tabelaHash.inserir(new Jogador(10, "Neymar JR"));
        tabelaHash.inserir(new Jogador(11, "Raphinha"));
        tabelaHash.inserir(new Jogador(12, "Weverton"));
        tabelaHash.inserir(new Jogador(13, "D. Alves"));
        tabelaHash.inserir(new Jogador(14, "É. Militão"));
        tabelaHash.inserir(new Jogador(15, "Fabinho"));
        tabelaHash.inserir(new Jogador(16, "Alex Sandro"));
        tabelaHash.inserir(new Jogador(17, "B. Guimarães"));
        tabelaHash.inserir(new Jogador(19, "Antony"));
        tabelaHash.inserir(new Jogador(20, "Vini Jr"));
        tabelaHash.inserir(new Jogador(21, "Rodrygo"));
        tabelaHash.inserir(new Jogador(22, "E. Ribeiro"));
        tabelaHash.inserir(new Jogador(23, "Ederson"));
        tabelaHash.inserir(new Jogador(24, "Bremer"));
        tabelaHash.inserir(new Jogador(25, "Pedro"));
        tabelaHash.inserir(new Jogador(26, "G. Martinelli"));

        // Exibindo a tabela
        tabelaHash.exibirTabela();

        // Buscando um jogador por chave
        int chaveBusca = 10;
        Jogador jogadorEncontrado = tabelaHash.buscar(chaveBusca);
        if (jogadorEncontrado != null) {
            System.out.println("Jogador encontrado: " + jogadorEncontrado.getNome());
        } else {
            System.out.println("Jogador não encontrado para a chave " + chaveBusca);
        }

        // Removendo um jogador por chave
        int chaveRemover = 10;
        Jogador jogadorRemovido = tabelaHash.remover(chaveRemover);
        if (jogadorRemovido != null) {
            System.out.println("Jogador removido: " + jogadorRemovido.getNome());
        } else {
            System.out.println("Jogador não encontrado para remover com chave " + chaveRemover);
        }

        // Exibindo a tabela após a remoção
        tabelaHash.exibirTabela();
        System.out.println(tabelaHash.buscar(20).getNome());
        tabelaHash.inserir(new Jogador(10, "Neymar Jr"));

        tabelaHash.exibirTabela();
    }
}
