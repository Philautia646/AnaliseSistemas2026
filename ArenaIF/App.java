import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato(
            "Torneio Intercursos E-Sports 2026",
            "League of Legends",
            LocalDate.of(2026, 4, 1),
            LocalDate.of(2026, 4, 10),
            8,
            FormatoCompeticao.ELIMINATORIA_SIMPLES,
            SituacaoCampeonato.EM_ANDAMENTO
        );

        Aluno a1 = new Aluno("João Pedro", "202401");
        Aluno a2 = new Aluno("Maria Eduarda", "202402");
        Aluno a3 = new Aluno("Lucas Silva", "202403");
        Aluno a4 = new Aluno("Beatriz Santos", "202404");

        Equipe eq1 = new Equipe("Alpha Dragons", a1);
        Equipe eq2 = new Equipe("Beta Warriors", a2);
        Equipe eq3 = new Equipe("Gamma Titans", a3);
        Equipe eq4 = new Equipe("Delta Phoenix", a4);

        campeonato.inscreverEquipe(eq1);
        campeonato.inscreverEquipe(eq2);
        campeonato.inscreverEquipe(eq3);
        campeonato.inscreverEquipe(eq4);

        Partida partida1 = new Partida(
            eq1,
            eq2,
            LocalDate.of(2026, 4, 2),
            1,
            "2 x 1",
            SituacaoPartida.FINALIZADA
        );

        campeonato.registrarPartida(partida1);

        System.out.println(campeonato);
    }
}