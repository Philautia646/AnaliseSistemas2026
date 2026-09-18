import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Aluno responsavel = new Aluno("Mariana Lima", "2023501");
        Aluno vendedor = new Aluno("Felipe Rocha", "2023502");
        Aluno comprador = new Aluno("Camila Alves", "2023503");

        Campanha campanha = new Campanha(
            "Arrecadação Formatria 2026",
            "Venda de doces e produtos para a festa de formatura",
            TipoCampanha.DOCES,
            LocalDate.of(2026, 5, 1),
            LocalDate.of(2026, 5, 30),
            1500.00,
            responsavel
        );

        Produto p1 = new Produto("Brownie Recheado", "Brownie de chocolate com recheio de ninho", 6.00, 50, "Doces");
        Produto p2 = new Produto("Bolo no Pote", "Bolo sabor prestígio 250ml", 8.50, 30, "Doces");

        campanha.cadastrarProduto(p1);
        campanha.cadastrarProduto(p2);

        Venda venda = new Venda(
            vendedor,
            comprador,
            LocalDate.now(),
            FormaPagamento.PIX,
            SituacaoVenda.ENTREGUE
        );

        venda.adicionarItem(new ItemVenda(p1, 2, p1.getPreco()));
        venda.adicionarItem(new ItemVenda(p2, 1, p2.getPreco()));

        campanha.registrarVenda(venda);

        System.out.println(campanha);
    }
}