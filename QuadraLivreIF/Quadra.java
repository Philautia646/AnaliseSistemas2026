import java.util.ArrayList;
import java.util.List;

public class Quadra {
    private String nome;
    private String localizacao;
    private TipoPiso tipoPiso;
    private List<Modalidade> modalidadesPermitidas;

    public Quadra(String nome, String localizacao, TipoPiso tipoPiso) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoPiso = tipoPiso;
        this.modalidadesPermitidas = new ArrayList<>();
    }

    public void adicionarModalidade(Modalidade modalidade) {
        this.modalidadesPermitidas.add(modalidade);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public TipoPiso getTipoPiso() { return tipoPiso; }
    public void setTipoPiso(TipoPiso tipoPiso) { this.tipoPiso = tipoPiso; }

    public List<Modalidade> getModalidadesPermitidas() { return modalidadesPermitidas; }

    @Override
    public String toString() {
        return nome + " [Local: " + localizacao + ", Piso: " + tipoPiso + ", Modalidades: " + modalidadesPermitidas + "]";
    }
}