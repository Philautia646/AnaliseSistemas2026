import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private Aluno capitao;
    private List<Aluno> jogadores;

    public Equipe(String nome, Aluno capitao) {
        this.nome = nome;
        this.capitao = capitao;
        this.jogadores = new ArrayList<>();
        this.jogadores.add(capitao);
    }

    public void adicionarJogador(Aluno jogador) {
        this.jogadores.add(jogador);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Aluno getCapitao() { return capitao; }
    public void setCapitao(Aluno capitao) { this.capitao = capitao; }

    public List<Aluno> getJogadores() { return jogadores; }

    @Override
    public String toString() {
        return nome + " [Capitão: " + capitao.getNome() + ", Jogadores: " + jogadores.size() + "]";
    }
}