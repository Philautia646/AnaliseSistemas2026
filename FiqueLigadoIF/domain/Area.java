package AnaliseSistemas2026.FiqueLigadoIF.domain;

import java.util.List;

public class Area {
    private Integer id;
    private String nome;
    private List<AreaDaAtividade> atividadesOfertadas;

    public Area(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<AreaDaAtividade> getAtividadesOfertadas() { return atividadesOfertadas; }
    public void setAtividadesOfertadas(List<AreaDaAtividade> atividadesOfertadas) { this.atividadesOfertadas = atividadesOfertadas; }

    @Override
    public String toString() {
        return "Area [id=" + id + ", nome=" + nome + "]";
    }
}