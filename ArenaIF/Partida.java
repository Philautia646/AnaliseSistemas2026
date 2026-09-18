import java.time.LocalDate;

public class Partida {
    private Equipe equipe1;
    private Equipe equipe2;
    private LocalDate data;
    private int rodada;
    private String pontuacao;
    private SituacaoPartida situacao;

    public Partida(Equipe equipe1, Equipe equipe2, LocalDate data, int rodada, String pontuacao, SituacaoPartida situacao) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.data = data;
        this.rodada = rodada;
        this.pontuacao = pontuacao;
        this.situacao = situacao;
    }

    public Equipe getEquipe1() { return equipe1; }
    public void setEquipe1(Equipe equipe1) { this.equipe1 = equipe1; }

    public Equipe getEquipe2() { return equipe2; }
    public void setEquipe2(Equipe equipe2) { this.equipe2 = equipe2; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public int getRodada() { return rodada; }
    public void setRodada(int rodada) { this.rodada = rodada; }

    public String getPontuacao() { return pontuacao; }
    public void setPontuacao(String pontuacao) { this.pontuacao = pontuacao; }

    public SituacaoPartida getSituacao() { return situacao; }
    public void setSituacao(SituacaoPartida situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return "Rodada " + rodada + " (" + data + "): " + equipe1.getNome() + " [" + pontuacao + "] " + equipe2.getNome() + " - Status: " + situacao;
    }
}