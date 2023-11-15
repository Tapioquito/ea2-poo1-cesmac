package Model.Entities;

import Model.Entities.Enums.TipoIngresso;

public class Ingresso {
    private Filme Filme;
    private TipoIngresso Tipo;
    private String HorarioDaSessao;

    public Ingresso() {
    }

    public Ingresso(Model.Entities.Filme filme, TipoIngresso tipo, String horarioDaSessao) {
        Filme = filme;
        Tipo = tipo;
        HorarioDaSessao = horarioDaSessao;
    }

    public Model.Entities.Filme getFilme() {
        return Filme;
    }

    public void setFilme(Model.Entities.Filme filme) {
        Filme = filme;
    }

    public TipoIngresso getTipo() {
        return Tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        Tipo = tipo;
    }

    public String getHorarioDaSessao() {
        return HorarioDaSessao;
    }

    public void setHorarioDaSessao(String horarioDaSessao) {
        HorarioDaSessao = horarioDaSessao;
    }
}
