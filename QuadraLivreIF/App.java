import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Quadra quadra1 = new Quadra("Quadra Coberta A", "Bloco Esportivo Principal", TipoPiso.EMBORRACHADO);
        quadra1.adicionarModalidade(Modalidade.FUTSAL);
        quadra1.adicionarModalidade(Modalidade.BASQUETE);

        Quadra quadra2 = new Quadra("Quadra Poliesportiva B", "Área Externa", TipoPiso.CONCRETO);
        quadra2.adicionarModalidade(Modalidade.VOLEI);
        quadra2.adicionarModalidade(Modalidade.PETECA);
        quadra2.adicionarModalidade(Modalidade.HANDEBOL);

        Aluno aluno1 = new Aluno("Lucas Mendes", "2023201");
        Aluno aluno2 = new Aluno("Fernanda Lima", "2023202");
        Aluno aluno3 = new Aluno("Gabriel Alves", "2023203");

        // 1
        Agendamento agendamento1 = new Agendamento(
            quadra1,
            Modalidade.FUTSAL,
            LocalDate.of(2026, 3, 22),
            LocalTime.of(16, 0),
            LocalTime.of(17, 30),
            aluno1,
            SituacaoAgendamento.CONFIRMADO
        );
        agendamento1.adicionarParticipante(aluno2);
        agendamento1.adicionarParticipante(aluno3);

        // 2
        Agendamento agendamento2 = new Agendamento(
            quadra2,
            Modalidade.VOLEI,
            LocalDate.of(2026, 3, 23),
            LocalTime.of(18, 0),
            LocalTime.of(19, 30),
            aluno2,
            SituacaoAgendamento.SOLICITADO
        );
        agendamento2.adicionarParticipante(aluno1);

        System.out.println(agendamento1);
        System.out.println("----------------------------------------");
        System.out.println(agendamento2);
    }
}