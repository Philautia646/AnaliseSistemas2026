public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private int quantidadeMaximaPassageiros;

    public Veiculo(String placa, String modelo, String cor, int quantidadeMaximaPassageiros) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getQuantidadeMaximaPassageiros() { return quantidadeMaximaPassageiros; }
    public void setQuantidadeMaximaPassageiros(int quantidadeMaximaPassageiros) { 
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros; 
    }

    @Override
    public String toString() {
        return modelo + " [" + cor + ", Placa: " + placa + ", Lotação Máx: " + quantidadeMaximaPassageiros + "]";
    }
}
