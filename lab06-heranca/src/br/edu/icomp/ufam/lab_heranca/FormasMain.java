package br.edu.icomp.ufam.lab_heranca;

import java.util.Vector;

public class FormasMain {
    public static void main(String[] args) {
        Vector<FormaGeometrica> formasGeometricas = new Vector<>();
        Circulo circulo = new Circulo(2,6,5);
        Quadrado quadrado= new Quadrado(8, 5, 3);
        Retangulo retangulo = new Retangulo(1, 2, 8, 6);

        formasGeometricas.add(circulo);
        formasGeometricas.add(quadrado);
        formasGeometricas.add(retangulo);

        for (FormaGeometrica forma: formasGeometricas) {
            System.out.println(forma.toString());
        }
    }

}
