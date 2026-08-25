package AnaliseSistemas2026.FiqueLigadoIF.domain;

public class AreaDaAtividade {
    private Integer id;
    private Area area;
    private Atividade atividade;

    public AreaDaAtividade(Integer id, Area area, Atividade atividade) {
        this.id = id;
        this.area = area;
        this.atividade = atividade;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Area getArea() { return area; }
    public void setArea(Area area) { this.area = area; }

    public Atividade getAtividade() { return atividade; }
    public void setAtividade(Atividade atividade) { this.atividade = atividade; }

    @Override
    public String toString() {
        return "AreaDaAtividade [id=" + id + ", area=" + area + ", atividade=" + atividade + "]";
    }
}