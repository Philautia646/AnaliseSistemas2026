public class NumeroRifa {
    private int numero;
    private double valor;
    private Aluno comprador;
    private SituacaoRifa situacao;

    public NumeroRifa(int numero, double valor, SituacaoRifa situacao) {
        this.numero = numero;
        this.valor = valor;
        this.situacao = situacao;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public Aluno getComprador() { return comprador; }
    public void setComprador(Aluno comprador) { this.comprador = comprador; }

    public SituacaoRifa getSituacao() { return situacao; }
    public void setSituacao(SituacaoRifa situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return "Nº " + numero + " [R$ " + String.format("%.2f", valor) + " | Status: " + situacao + (comprador != null ? " | Comprador: " + comprador.getNome() : "") + "]";
    }
}