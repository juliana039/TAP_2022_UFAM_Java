
public class Processador {
    public String marca;
    public String modelo;
    public double velocidade;
    public int numNucleos;

    public Processador(){}

    public Processador(String marca, String modelo, double velocidade, int numNucleos){
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidade = velocidade;
    }

    public double getVelocidadeParalela(){
        return velocidade*numNucleos;
    }

    public String getDescricao(){
        String a;
        a = "Processador: marca="+ marca + ", modelo=" + modelo + ", velocidade=" + velocidade+ "GHz, numNucleos="+ numNucleos + ", velocidadeParalela="+ getVelocidadeParalela()+ "GHz.";
        return a;
    }

}