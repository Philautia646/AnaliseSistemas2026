import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private String jogo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private int quantidadeMaximaParticipantes;
    private FormatoCompeticao formato;
    private SituacaoCampeonato situacao;
    private List<Equipe> equipes;
    private List<Partida> partidas;

    public Campeonato(String nome, String jogo, LocalDate dataInicio, LocalDate dataTermino, int quantidadeMaximaParticipantes, FormatoCompeticao formato, SituacaoCampeonato situacao) {
        this.nome = nome;
        this.jogo = jogo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.quantidadeMaximaParticipantes = quantidadeMaximaParticipantes;
        this.formato = formato;
        this.situacao = situacao;
        this.equipes = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public void inscreverEquipe(Equipe equipe) {
        if (equipes.size() < quantidadeMaximaParticipantes) {
            equipes.add(equipe);
        }
    }

    public void registrarPartida(Partida partida) {
        partidas.add(partida);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getJogo() { return jogo; }
    public void setJogo(String jogo) { this.jogo = jogo; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataTermino() { return dataTermino; }
    public void setDataTermino(LocalDate dataTermino) { this.dataTermino = dataTermino; }

    public int getQuantidadeMaximaParticipantes() { return quantidadeMaximaParticipantes; }
    public void setQuantidadeMaximaParticipantes(int quantidadeMaximaParticipantes) { this.quantidadeMaximaParticipantes = quantidadeMaximaParticipantes; }

    public FormatoCompeticao getFormato() { return formato; }
    public void setFormato(FormatoCompeticao formato) { this.formato = formato; }

    public SituacaoCampeonato getSituacao() { return situacao; }
    public void setSituacao(SituacaoCampeonato situacao) { this.situacao = situacao; }

    public List<Equipe> getEquipes() { return equipes; }
    public List<Partida> getPartidas() { return partidas; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAMPEONATO ARENAIF ===\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Jogo: ").append(jogo).append("\n");
        sb.append("Período: ").append(dataInicio).append(" até ").append(dataTermino).append("\n");
        sb.append("Formato: ").append(formato).append("\n");
        sb.append("Situação: ").append(situacao).append("\n");
        sb.append("Equipes Inscritas (").append(equipes.size()).append("/").append(quantidadeMaximaParticipantes).append("):\n");
        for (Equipe e : equipes) {
            sb.append(" - ").append(e).append("\n");
        }
        sb.append("Partidas Registradas (").append(partidas.size()).append("):\n");
        for (Partida p : partidas) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }
}