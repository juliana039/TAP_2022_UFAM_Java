package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class Celular implements Localizavel {
    private int codPais;
    private int codArea;
    private int numero;

    public Celular(int codPais, int codArea, int numero) {
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    public int getCodPais() {
        return codPais;

    }

    public final void setCodPais(int codPais) {
        if(codPais > 1 && codPais <= 1999){
            this.codPais = codPais;
        }else{
            this.codPais = -1;
        }
    }

    public int getCodArea() {
        return codArea;
    }

    public final void setCodArea(int codArea) {
        if(codArea > 10 && codArea <= 99){
            this.codArea = codArea;
        }else{
            this.codArea = -1;
        }
    }

    public int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        if(numero > 10000000 && numero < 999999999){
            this.numero = numero;
        }else{
            this.numero = -1;
        }
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
        return 50.0;
    }
}
