package TabelaHash;

public class EstruturaHash implements Metodos{
    private int tamanho;

    public EstruturaHash(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int funcaoHash(int chave) {
        return chave % this.tamanho;
    }

    public int funcaoHash(int chave, int tamanho) {
        return chave % this.tamanho;
    }

    @Override
    public void inserir(Jogador jogador) {

    }

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
