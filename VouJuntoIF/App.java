import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Aluno motorista = new Aluno("Carlos Silva", "2023101");
        Veiculo veiculo = new Veiculo("ABC-1234", "Gol 1.0", "Prata", 4);

        Carona carona = new Carona(
            motorista,
            veiculo,
            "Terminal Central",
            "Campus IF",
            LocalDate.of(2026, 3, 20),
            LocalTime.of(7, 15),
            3,
            SituacaoCarona.ABERTA
        );

        Aluno aluno1 = new Aluno("Mariana Costa", "2023102");
        Aluno aluno2 = new Aluno("Pedro Rocha", "2023103");
        Aluno aluno3 = new Aluno("Beatriz Lima", "2023104");

        SolicitacaoVaga sol1 = new SolicitacaoVaga(aluno1, LocalDate.now(), SituacaoSolicitacao.ACEITA);
        SolicitacaoVaga sol2 = new SolicitacaoVaga(aluno2, LocalDate.now(), SituacaoSolicitacao.PENDENTE);
        SolicitacaoVaga sol3 = new SolicitacaoVaga(aluno3, LocalDate.now(), SituacaoSolicitacao.RECUSADA);

        carona.adicionarSolicitacao(sol1);
        carona.adicionarSolicitacao(sol2);
        carona.adicionarSolicitacao(sol3);

        System.out.println(carona);
    }
}