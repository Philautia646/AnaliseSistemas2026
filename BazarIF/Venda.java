import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Aluno vendedor;
    private Aluno comprador;
    private LocalDate data;
    private FormaPagamento formaPagamento;
    private SituacaoVenda situacao;
    private List<ItemVenda> itens;

    public Venda(Aluno vendedor, Aluno comprador, LocalDate data, FormaPagamento formaPagamento, SituacaoVenda situacao) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.situacao = situacao;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public Aluno getVendedor() { return vendedor; }
    public void setVendedor(Aluno vendedor) { this.vendedor = vendedor; }

    public Aluno getComprador() { return comprador; }
    public void setComprador(Aluno comprador) { this.comprador = comprador; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(FormaPagamento formaPagamento) { this.formaPagamento = formaPagamento; }

    public SituacaoVenda getSituacao() { return situacao; }
    public void setSituacao(SituacaoVenda situacao) { this.situacao = situacao; }

    public List<ItemVenda> getItens() { return itens; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda em ").append(data).append(" | Vendedor: ").append(vendedor.getNome()).append(" | Comprador: ").append(comprador.getNome()).append("\n");
        sb.append("Forma de Pagamento: ").append(formaPagamento).append(" | Status: ").append(situacao).append("\n");
        sb.append("Itens:\n");
        for (ItemVenda i : itens) {
            sb.append(" - ").append(i).append("\n");
        }
        sb.append("Total da Venda: R$ ").append(String.format("%.2f", getTotal())).append("\n");
        return sb.toString();
    }
}