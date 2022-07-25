package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;

    public Caminho(int maxTam){
        tamanho = 0;
        caminho = new Coordenada[maxTam];
    }

    public int tamanho(){
        return tamanho;
    }

    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
        if(tamanho == caminho.length){
            throw new TamanhoMaximoExcedidoException();
        }

        if(tamanho > 0){
            if (coordenada.distancia( caminho[tamanho - 1]) > 15) {
                throw new DistanciaEntrePontosExcedidaException();
            }
        }
        caminho[tamanho] = coordenada;
        tamanho++;
    }

    public void reset(){
        caminho = new Coordenada[]{};
        tamanho = 0;
    }

    public String toString(){
        String a = String.format("Dados do caminho:\n  - Quantidade de pontos: %d\n  - Pontos:", this.tamanho());

        for (int i=0;i<this.tamanho();i++){
            a += "\n    -> "+ this.caminho[i].getPosX() + ", "+ this.caminho[i].getPosY();
        }

        return a;
    }
}
