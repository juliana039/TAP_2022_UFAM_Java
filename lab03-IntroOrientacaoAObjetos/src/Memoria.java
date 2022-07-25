
public class Memoria {
    public String marca;
    public String tipo;
    public double tamanho;
    public double velocidade;
    public int numPentes;



    public Memoria(String kingstone, String ddr4, double v, double v1, int i, double v2, double v3){}

    public Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    public double getTamanhoTotal(){
        return numPentes*tamanho;
    }

    public double getVelocidadeParalela(){
        return numPentes*velocidade;
    }

    public String getDescricao(){
        String a = "Memoria: marca="+ marca + ", tipo=" + tipo +", tamanho="+ tamanho + "GB, velocidade=" + velocidade+ "GHz, numPentes="+ numPentes + ", tamanhoTotal="+ getTamanhoTotal() + "GB, velocidadeParalela="+ getVelocidadeParalela()+ "GHz.";
        return a;
    }
}
