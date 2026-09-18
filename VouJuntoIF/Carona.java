import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carona {
    private Aluno motorista;
    private Veiculo veiculo;
    private String localSaida;
    private String destino;
    private LocalDate data;
    private LocalTime horario;
    private int quantidadeVagasDisponiveis;
    private SituacaoCarona situacao;
    private List<SolicitacaoVaga> solicitacoes;

    public Carona(Aluno motorista, Veiculo veiculo, String localSaida, String destino, LocalDate data, LocalTime horario, int quantidadeVagasDisponiveis, SituacaoCarona situacao) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.localSaida = localSaida;
        this.destino = destino;
        this.data = data;
        this.horario = horario;
        this.quantidadeVagasDisponiveis = quantidadeVagasDisponiveis;
        this.situacao = situacao;
        this.solicitacoes = new ArrayList<>();
    }

    public void adicionarSolicitacao(SolicitacaoVaga solicitacao) {
        this.solicitacoes.add(solicitacao);
    }

    public Aluno getMotorista() { return motorista; }
    public void setMotorista(Aluno motorista) { this.motorista = motorista; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public String getLocalSaida() { return localSaida; }
    public void setLocalSaida(String localSaida) { this.localSaida = localSaida; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHorario() { return horario; }
    public void setHorario(LocalTime horario) { this.horario = horario; }

    public int getQuantidadeVagasDisponiveis() { return quantidadeVagasDisponiveis; }
    public void setQuantidadeVagasDisponiveis(int quantidadeVagasDisponiveis) { this.quantidadeVagasDisponiveis = quantidadeVagasDisponiveis; }

    public SituacaoCarona getSituacao() { return situacao; }
    public void setSituacao(SituacaoCarona situacao) { this.situacao = situacao; }

    public List<SolicitacaoVaga> getSolicitacoes() { return solicitacoes; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CARONA VOUJUNTOIF ===\n");
        sb.append("Motorista: ").append(motorista).append("\n");
        sb.append("Veículo: ").append(veiculo).append("\n");
        sb.append("Trajeto: ").append(localSaida).append(" -> ").append(destino).append("\n");
        sb.append("Data/Hora: ").append(data).append(" às ").append(horario).append("\n");
        sb.append("Vagas Disponíveis: ").append(quantidadeVagasDisponiveis).append("\n");
        sb.append("Situação da Carona: ").append(situacao).append("\n");
        sb.append("Solicitações (").append(solicitacoes.size()).append("):\n");
        for (SolicitacaoVaga s : solicitacoes) {
            sb.append(" - ").append(s).append("\n");
        }
        return sb.toString();
    }
}