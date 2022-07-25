package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
    public double largura;
    public double altura;

    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.altura = altura;
        this.largura = largura;
    }


    public double getArea() {
        double area = largura*altura;
        return area;
    }
    public double getPerimetro() {
        double per = 2*(largura+altura);
        return per;
    }

    public String toString(){
        String a = "Retângulo na "+ getPosString()+ " com largura de " +largura + "cm e altura de " + altura + "cm (área=" +getArea() +"cm2, perímetro="+ getPerimetro()+"cm)";
        return a;
    }
}
