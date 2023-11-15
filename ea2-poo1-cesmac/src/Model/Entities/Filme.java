package Model.Entities;

public class Filme {
    private String Nome;
    private String Diretor;
    private String Descricao;
    private String Genero;
    private int DuracaoEmMinutos;

    public Filme() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        DuracaoEmMinutos = duracaoEmMinutos;
    }

    public Filme(String nome, String diretor, String descricao, String genero, int duracaoEmMinutos) {
        Nome = nome;
        Diretor = diretor;
        Descricao = descricao;
        Genero = genero;
        DuracaoEmMinutos = duracaoEmMinutos;
    }
}
