import java.time.LocalDate;

public class PasseEscolar {
    private String numero;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private SituacaoPasse situacao;

    public PasseEscolar(String numero, LocalDate dataEmissao, LocalDate dataValidade, SituacaoPasse situacao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }

    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }

    public SituacaoPasse getSituacao() { return situacao; }
    public void setSituacao(SituacaoPasse situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return "Passe № " + numero + " [Emissão: " + dataEmissao + ", Validade: " + dataValidade + ", Status: " + situacao + "]";
    }
}