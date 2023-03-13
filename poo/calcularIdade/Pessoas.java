import java.time.LocalDate;

public class Pessoas {
    private String nome;
    private int anoNascimento;

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int idade = anoAtual - anoNascimento;
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
}
