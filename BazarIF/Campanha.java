import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campanha {
    private String titulo;
    private String descricao;
    private TipoCampanha tipo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double metaFinanceira;
    private Aluno reponsavel;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public Campanha(String titulo, String descricao, TipoCampanha tipo, LocalDate dataInicio, LocalDate dataTermino, double metaFinanceira, Aluno reponsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.metaFinanceira = metaFinanceira;
        this.reponsavel = reponsavel;
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void registrarVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public TipoCampanha getTipo() { return tipo; }
    public void setTipo(TipoCampanha tipo) { this.tipo = tipo; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataTermino() { return dataTermino; }
    public void setDataTermino(LocalDate dataTermino) { this.dataTermino = dataTermino; }

    public double getMetaFinanceira() { return metaFinanceira; }
    public void setMetaFinanceira(double metaFinanceira) { this.metaFinanceira = metaFinanceira; }

    public Aluno getReponsavel() { return reponsavel; }
    public void setReponsavel(Aluno reponsavel) { this.reponsavel = reponsavel; }

    public List<Produto> getProdutos() { return produtos; }
    public List<Venda> getVendas() { return vendas; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAMPANHA BAZARIF ===\n");
        sb.append("Título: ").append(titulo).append(" (").append(tipo).append(")\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Período: ").append(dataInicio).append(" a ").append(dataTermino).append("\n");
        sb.append("Meta Financeira: R$ ").append(String.format("%.2f", metaFinanceira)).append("\n");
        sb.append("Responsável: ").append(reponsavel).append("\n");
        sb.append("Produtos Cadastrados (").append(produtos.size()).append("):\n");
        for (Produto p : produtos) {
            sb.append(" - ").append(p).append("\n");
        }
        sb.append("Vendas Realizadas (").append(vendas.size()).append("):\n");
        for (Venda v : vendas) {
            sb.append(" - ").append(v).append("\n");
        }
        return sb.toString();
    }
}