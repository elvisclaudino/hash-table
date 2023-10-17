package TabelaHash.EnderecamentoAberto;

import TabelaHash.Jogador;

public class Teste {
    public static void main(String[] args) {
        int tamanhoTabela = 10; // Defina o tamanho da tabela hash

        EnderecamentoAberto tabelaHash = new EnderecamentoAberto(tamanhoTabela);

        // Inserindo jogadores na tabela
        Jogador jogador1 = new Jogador(1, "Alisson");
        Jogador jogador2 = new Jogador(2, "Danilo");
        Jogador jogador3 = new Jogador(3, "T. Silva");
        Jogador jogador4 = new Jogador(4, "Marquinhos");
        Jogador jogador5 = new Jogador(5, "Casemiro");
        Jogador jogador7 = new Jogador(7, "L. Paquetá");
        Jogador jogador8 = new Jogador(8, "Fred");
        Jogador jogador9 = new Jogador(9, "Richarlison");
        Jogador jogador10 = new Jogador(10, "Neymar JR");
        Jogador jogador11 = new Jogador(11, "Raphinha");
        Jogador jogador12 = new Jogador(12, "Weverton");
        Jogador jogador13 = new Jogador(13, "D. Alves");
        Jogador jogador14 = new Jogador(14, "É. Militão");
        Jogador jogador15 = new Jogador(15, "Fabinho");
        Jogador jogador16 = new Jogador(16, "Alex Sandro");
        Jogador jogador17 = new Jogador(17, "B. Guimarães");
        Jogador jogador19 = new Jogador(19, "Antony");
        Jogador jogador20 = new Jogador(20, "Vini Jr");
        Jogador jogador21 = new Jogador(21, "Rodrygo");
        Jogador jogador22 = new Jogador(22, "E. Ribeiro");
        Jogador jogador23 = new Jogador(23, "Ederson");
        Jogador jogador24 = new Jogador(24, "Bremer");
        Jogador jogador25 = new Jogador(25, "Pedro");
        Jogador jogador26 = new Jogador(26, "G. Martinelli");

        tabelaHash.inserir(jogador1);
        tabelaHash.inserir(jogador2);
        tabelaHash.inserir(jogador3);
        tabelaHash.inserir(jogador4);
        tabelaHash.inserir(jogador5);
        tabelaHash.inserir(jogador7);
        tabelaHash.inserir(jogador8);
        tabelaHash.inserir(jogador9);
        tabelaHash.inserir(jogador10);
        tabelaHash.inserir(jogador11);
        tabelaHash.inserir(jogador12);
        tabelaHash.inserir(jogador13);
        tabelaHash.inserir(jogador14);
        tabelaHash.inserir(jogador15);
        tabelaHash.inserir(jogador16);
        tabelaHash.inserir(jogador17);
        tabelaHash.inserir(jogador19);
        tabelaHash.inserir(jogador20);
        tabelaHash.inserir(jogador21);
        tabelaHash.inserir(jogador22);
        tabelaHash.inserir(jogador23);
        tabelaHash.inserir(jogador24);
        tabelaHash.inserir(jogador25);
        tabelaHash.inserir(jogador26);

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
    }
}
