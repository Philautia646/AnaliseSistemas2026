import java.time.LocalDate;

public class SolicitacaoVaga {
    private Aluno passageiro;
    private LocalDate dataSolicitacao;
    private SituacaoSolicitacao situacao;

    public SolicitacaoVaga(Aluno passageiro, LocalDate dataSolicitacao, SituacaoSolicitacao situacao) {
        this.passageiro = passageiro;
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
    }

    public Aluno getPassageiro() { return passageiro; }
    public void setPassageiro(Aluno passageiro) { this.passageiro = passageiro; }

    public LocalDate getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDate dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }

    public SituacaoSolicitacao getSituacao() { return situacao; }
    public void setSituacao(SituacaoSolicitacao situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return "Solicitação [Passageiro: " + passageiro.getNome() + ", Data: " + dataSolicitacao + ", Status: " + situacao + "]";
    }
}