package TabelaHash;

public class Jogador {
    private int numeroCamisa;
    private String nome;

    public Jogador(int numeroCamisa, String nome) {
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
