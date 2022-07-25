
public class Computador {
    public String fabricantes;
    public Processador processador;
    public Memoria memoria;
    public  Disco disco;

    public Computador(String fabricantes, Processador processador, Memoria memoria, Disco disco) {
        this.fabricantes = fabricantes;
        this.processador = processador;
        this.memoria = memoria;
        this.disco = disco;
    }

    public String getDescricao(){
        String res = "Computador da fabricante "+fabricantes+". Processador: marca="+processador.marca+", modelo="+processador.modelo+", velocidade="+processador.velocidade+"GHz, numNucleos="+processador.numNucleos+", velocidadeParalela="+processador.getVelocidadeParalela()+"GHz. Memoria: marca="+memoria.marca+", tipo="+memoria.tipo+", tamanho="+memoria.tamanho+"GB, velocidade="+memoria.velocidade+"GHz, numPentes="+memoria.numPentes+", tamanhoTotal="+memoria.getTamanhoTotal()+"GB, velocidadeParalela="+memoria.getVelocidadeParalela()+"GHz. Disco: marca="+disco.marca+", tipo="+disco.tipo+", capacidade="+ disco.capacidade+"GB, rpm="+disco.rpm+"rpm.";
        return res;
    }
}
