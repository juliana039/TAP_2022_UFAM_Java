package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main( String[] args ) {
        try{
            Coordenada cord1 = new Coordenada(1000, 2500, 8);
            Coordenada cord2 = new Coordenada(1500, 2350, 3);
            Caminho caminho = new Caminho(10);
            
            caminho.addCoordenada(cord1);
            caminho.addCoordenada(cord2);

        }catch( RoverCoordenadaException | RoverCaminhoException roverCoordenadaException){
            System.out.println( roverCoordenadaException.getMessage());
        }
    }
}
