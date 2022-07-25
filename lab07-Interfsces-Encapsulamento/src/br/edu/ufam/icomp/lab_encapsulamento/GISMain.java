package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        Localizavel[]  localizavels = new Localizavel[]{};
        Celular celular = new Celular(1,2,3);
        CarroLuxuoso clux = new CarroLuxuoso("NOO4137");

        localizavels[0] = celular;
        localizavels[1] = clux;

        System.out.println(localizavels[0].getPosicao());
        System.out.println(localizavels[1].getPosicao());
    }
}
