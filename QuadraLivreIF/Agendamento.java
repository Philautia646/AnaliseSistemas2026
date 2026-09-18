import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private Quadra quadra;
    private Modalidade modalidade;
    private LocalDate data;
    private LocalTime horarioInicial;
    private LocalTime horarioFinal;
    private Aluno solicitante;
    private List<Aluno> participantes;
    private SituacaoAgendamento situacao;

    public Agendamento(Quadra quadra, Modalidade modalidade, LocalDate data, LocalTime horarioInicial, LocalTime horarioFinal, Aluno solicitante, SituacaoAgendamento situacao) {
        this.quadra = quadra;
        this.modalidade = modalidade;
        this.data = data;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.solicitante = solicitante;
        this.situacao = situacao;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Aluno aluno) {
        this.participantes.add(aluno);
    }

    public Quadra getQuadra() { return quadra; }
    public void setQuadra(Quadra quadra) { this.quadra = quadra; }

    public Modalidade getModalidade() { return modalidade; }
    public void setModalidade(Modalidade modalidade) { this.modalidade = modalidade; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHorarioInicial() { return horarioInicial; }
    public void setHorarioInicial(LocalTime horarioInicial) { this.horarioInicial = horarioInicial; }

    public LocalTime getHorarioFinal() { return horarioFinal; }
    public void setHorarioFinal(LocalTime horarioFinal) { this.horarioFinal = horarioFinal; }

    public Aluno getSolicitante() { return solicitante; }
    public void setSolicitante(Aluno solicitante) { this.solicitante = solicitante; }

    public List<Aluno> getParticipantes() { return participantes; }

    public SituacaoAgendamento getSituacao() { return situacao; }
    public void setSituacao(SituacaoAgendamento situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== AGENDAMENTO QUADRALIVREIF ===\n");
        sb.append("Quadra: ").append(quadra.getNome()).append("\n");
        sb.append("Modalidade: ").append(modalidade).append("\n");
        sb.append("Data: ").append(data).append(" | Horário: ").append(horarioInicial).append(" às ").append(horarioFinal).append("\n");
        sb.append("Solicitante: ").append(solicitante).append("\n");
        sb.append("Status: ").append(situacao).append("\n");
        sb.append("Participantes (").append(participantes.size()).append("):\n");
        for (Aluno p : participantes) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }
}