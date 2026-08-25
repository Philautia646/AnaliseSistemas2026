package AnaliseSistemas2026.FiqueLigadoIF.domain;

public class AtividadeMinistrante {
    private Integer id;
    private Atividade atividade;
    private Pessoa ministrante;

    public AtividadeMinistrante(Integer id, Atividade atividade, Pessoa ministrante) {
        this.id = id;
        this.atividade = atividade;
        this.ministrante = ministrante;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }

    public Pessoa getMinistrante() { return ministrante; }
    public void setMinistrante(Pessoa ministrante) { this.ministrante = ministrante; }

    @Override
    public String toString() {
        return "AtividadeMinistrante [id=" + id + ", atividade=" + atividade + ", ministrante=" + ministrante + "]";
    }
}