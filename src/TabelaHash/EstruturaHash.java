package TabelaHash;

public class EstruturaHash implements Metodos{
    private int tamanho;

    public EstruturaHash(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int funcaoHash(int chave) {
        return chave % this.tamanho;
    } // função hash para o método de divisão

    public int funcaoHash(int chave, int tamanho) {
        return chave % this.tamanho;
    }

    @Override
    public void inserir(Jogador jogador) {} // insere um jogador na tabela

    @Override
    public Jogador buscar(int chave) {
        return null;
    }

    @Override
    public Jogador remover(int chave) {
        return null;
    }

    @Override
    public void exibirTabela() {
    }

    private void redimensionar() {
    }
}
