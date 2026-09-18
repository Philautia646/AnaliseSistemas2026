import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(
            "Ana Clara Souza",
            "123.456.789-00",
            "2024109",
            "Técnico em Informática",
            "Rua das Flores, 123",
            "Matutino"
        );

        LinhaOnibus linha = new LinhaOnibus(
            "T131",
            "Terminal Central / Campus IF",
            "Via Urbana S/A",
            "Terminal Central",
            "Campus IF"
        );

        SolicitacaoPasse solicitacao = new SolicitacaoPasse(
            estudante,
            linha,
            SituacaoSolicitacao.APROVADA
        ); 

        Documento doc1 = new Documento("Comprovante de Matrícula", LocalDate.of(2026, 2, 10), SituacaoDocumento.APROVADO);
        Documento doc2 = new Documento("Comprovante de Residência", LocalDate.of(2026, 2, 10), SituacaoDocumento.APROVADO);
        Documento doc3 = new Documento("Foto 3x4", LocalDate.of(2026, 2, 10), SituacaoDocumento.APROVADO);

        solicitacao.adicionarDocumento(doc1);
        solicitacao.adicionarDocumento(doc2);
        solicitacao.adicionarDocumento(doc3);

        PasseEscolar passe = new PasseEscolar(
            "2026-99887",
            LocalDate.of(2026, 2, 15),
            LocalDate.of(2026, 12, 31),
            SituacaoPasse.ATIVO
        );
        solicitacao.setPasseEscolar(passe);

        System.out.println(solicitacao);
        
    }
}