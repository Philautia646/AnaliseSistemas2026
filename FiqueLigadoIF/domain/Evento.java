package AnaliseSistemas2026.FiqueLigadoIF.domain;

import java.time.LocalDate;

public class Evento {
    private Integer id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String linkBanner;
    private StatusEnum status;
    private Double valorInscricao;
    private Usuario responsavel;
    private Usuario cadastroPor;

    public Evento(Integer id, String nome, LocalDate dataInicio, LocalDate dataFim, String linkBanner, StatusEnum status, Double valorInscricao, Usuario responsavel, Usuario cadastroPor) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.linkBanner = linkBanner;
        this.status = status;
        this.valorInscricao = valorInscricao;
        this.responsavel = responsavel;
        this.cadastroPor = cadastroPor;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    public String getLinkBanner() { return linkBanner; }
    public void setLinkBanner(String linkBanner) { this.linkBanner = linkBanner; }

    public StatusEnum getStatus() { return status; }
    public void setStatus(StatusEnum status) { this.status = status; }

    public Double getValorInscricao() { return valorInscricao; }
    public void setValorInscricao(Double valorInscricao) { this.valorInscricao = valorInscricao; }

    public Usuario getResponsavel() { return responsavel; }
    public void setResponsavel(Usuario responsavel) { this.responsavel = responsavel; }

    public Usuario getCadastroPor() { return cadastroPor; }
    public void setCadastroPor(Usuario cadastroPor) { this.cadastroPor = cadastroPor; }

    @Override
    public String toString() {
        return "Evento [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim +
               ", linkBanner=" + linkBanner + ", status=" + status + ", valorInscricao=" + valorInscricao +
               ", responsavel=" + responsavel + ", cadastroPor=" + cadastroPor + "]";
    }
}