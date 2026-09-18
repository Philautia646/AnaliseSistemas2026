import java.util.ArrayList;
import java.util.List;

public class SolicitacaoPasse {
    private Estudante estudante;
    private LinhaOnibus linhaOnibus;
    private List<Documento> documentos;
    private SituacaoSolicitacao situacao;
    private PasseEscolar passeEscolar;

    public SolicitacaoPasse(Estudante estudante, LinhaOnibus linhaOnibus, SituacaoSolicitacao situacao) {
        this.estudante = estudante;
        this.linhaOnibus = linhaOnibus;
        this.situacao = situacao;
        this.documentos = new ArrayList<>();
    }

    public void adicionarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public Estudante getEstudante() { return estudante; }
    public void setEstudante(Estudante estudante) { this.estudante = estudante; }

    public LinhaOnibus getLinhaOnibus() { return linhaOnibus; }
    public void setLinhaOnibus(LinhaOnibus linhaOnibus) { this.linhaOnibus = linhaOnibus; }

    public List<Documento> getDocumentos() { return documentos; }

    public SituacaoSolicitacao getSituacao() { return situacao; }
    public void setSituacao(SituacaoSolicitacao situacao) { this.situacao = situacao; }

    public PasseEscolar getPasseEscolar() { return passeEscolar; }
    public void setPasseEscolar(PasseEscolar passeEscolar) { this.passeEscolar = passeEscolar; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== SOLICITAÇÃO DE PASSE ESCOLAR BUSÃOIF ===\n");
        sb.append("Estudante: ").append(estudante).append("\n");
        sb.append("Linha Solicitada: ").append(linhaOnibus).append("\n");
        sb.append("Situação da Solicitação: ").append(situacao).append("\n");
        sb.append("Documentos Anexados (").append(documentos.size()).append("):\n");
        for (Documento d : documentos) {
            sb.append(" - ").append(d).append("\n");
        }
        sb.append("Passe Escolar Gerado: ").append(passeEscolar != null ? passeEscolar : "Nenhum no momento").append("\n");
        return sb.toString();
    }
}