public class LinhaOnibus {
    private String numero;
    private String nome;
    private String empresaResponsavel;
    private String pontoOrigem;
    private String pontoDestino;

    public LinhaOnibus(String numero, String nome, String empresaResponsavel, String pontoOrigem, String pontoDestino) {
        this.numero = numero;
        this.nome = nome;
        this.empresaResponsavel = empresaResponsavel;
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmpresaResponsavel() { return empresaResponsavel; }
    public void setEmpresaResponsavel(String empresaResponsavel) { this.empresaResponsavel = empresaResponsavel; }

    public String getPontoOrigem() { return pontoOrigem; }
    public void setPontoOrigem(String pontoOrigem) { this.pontoOrigem = pontoOrigem; }

    public String getPontoDestino() { return pontoDestino; }
    public void setPontoDestino(String pontoDestino) { this.pontoDestino = pontoDestino; }

    @Override
    public String toString() {
        return "Linha " + numero + " - " + nome + " (" + empresaResponsavel + ") [" + pontoOrigem + " -> " + pontoDestino + "]";
    }
}
