package TabelaHash;

public interface Metodos {
    public int funcaoHash(int chave);
    public void inserir(Jogador jogador);
    public Jogador buscar(int chave);
    public Jogador remover(int chave);
    public void exibirTabela();
}
