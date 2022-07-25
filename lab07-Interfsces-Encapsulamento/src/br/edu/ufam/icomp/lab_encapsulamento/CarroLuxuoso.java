package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{


    public CarroLuxuoso(String placa) {
        super(placa);
    }

    public Posicao getPosicao() {
        Random r = new Random();
        double valorMinimolat = -3.160000;
        double valorMaximolat = -2.960000;
        double latitude = valorMinimolat + (valorMaximolat - valorMinimolat) * r.nextDouble();

        double valorMinimolong = -60.120000;
        double valorMaximolong = -59.820000;
        double longitude = valorMinimolong + (valorMaximolong- valorMinimolong) * r.nextDouble();

        double valorMinimoalt = 15.0;
        double valorMaximoalt = 100.00;
        double altitude = valorMinimoalt + (valorMaximoalt - valorMinimoalt) * r.nextDouble();

        Posicao posicao = new Posicao(latitude,longitude, altitude);
        return posicao;
    }


    public double getErroLocalizacao() {
        return 15.0;
    }
}
