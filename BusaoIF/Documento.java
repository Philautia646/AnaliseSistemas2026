import java.time.LocalDate;

public class Documento {
    private String nome;
    private LocalDate dataEnvio;
    private SituacaoDocumento situacao;

    public Documento(String nome, LocalDate dataEnvio, SituacaoDocumento situacao) {
        this.nome = nome;
        this.dataEnvio = dataEnvio;
        this.situacao = situacao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataEnvio() { return dataEnvio; }
    public void setDataEnvio(LocalDate dataEnvio) { this.dataEnvio = dataEnvio; }

    public SituacaoDocumento getSituacao() { return situacao; }
    public void setSituacao(SituacaoDocumento situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return nome + " (Enviado em: " + dataEnvio + ", Status: " + situacao + ")";
    }
}