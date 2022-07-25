package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends  Retangulo{

    public Quadrado (int posX, int posY, double lado){
        super(posX, posY, lado, lado);

    }

    public String toString(){
        String a = "Quadrado na "+ getPosString()+ " com lado de " + largura + "cm (área=" +getArea() +"cm2, perímetro="+ getPerimetro()+"cm)";
        return a;
    }
}
