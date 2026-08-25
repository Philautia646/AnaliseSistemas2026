package AnaliseSistemas2026.FiqueLigadoIF.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Atividade {
    private Integer id;
    private String titulo;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Double cargaHoraria;
    private Integer quantidadeVagas;
    private Evento evento;
    private Local local;
    private List<AreaDaAtividade> areas;
    private List<Inscricao> inscritos;
    private List<AtividadeMinistrante> ministrantes;

    public Atividade(Integer id, String titulo, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Double cargaHoraria, Integer quantidadeVagas, Evento evento, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeVagas = quantidadeVagas;
        this.evento = evento;
        this.local = local;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public LocalDateTime getDataHoraInicio() { return dataHoraInicio; }
    public void setDataHoraInicio(LocalDateTime dataHoraInicio) { this.dataHoraInicio = dataHoraInicio; }

    public LocalDateTime getDataHoraFim() { return dataHoraFim; }
    public void setDataHoraFim(LocalDateTime dataHoraFim) { this.dataHoraFim = dataHoraFim; }

    public Double getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(Double cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public Integer getQuantidadeVagas() { return quantidadeVagas; }
    public void setQuantidadeVagas(Integer quantidadeVagas) { this.quantidadeVagas = quantidadeVagas; }

    public Evento getEvento() { return evento; }
    public void setEvento(Evento evento) { this.evento = evento; }

    public Local getLocal() { return local; }
    public void setLocal(Local local) { this.local = local; }

    public List<AreaDaAtividade> getAreas() { return areas; }
    public void setAreas(List<AreaDaAtividade> areas) { this.areas = areas; }

    public List<Inscricao> getInscritos() { return inscritos; }
    public void setInscritos(List<Inscricao> inscritos) { this.inscritos = inscritos; }

    public List<AtividadeMinistrante> getMinistrantes() { return ministrantes; }
    public void setMinistrantes(List<AtividadeMinistrante> ministrantes) { this.ministrantes = ministrantes; }

    @Override
    public String toString() {
        return "Atividade [id=" + id + ", titulo=" + titulo + ", dataHoraInicio=" + dataHoraInicio +
               ", dataHoraFim=" + dataHoraFim + ", cargaHoraria=" + cargaHoraria +
               ", quantidadeVagas=" + quantidadeVagas + ", evento=" + evento + ", local=" + local + "]";
    }
}