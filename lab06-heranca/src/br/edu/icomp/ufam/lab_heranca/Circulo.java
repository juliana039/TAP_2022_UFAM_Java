package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    public double raio;

    public double getArea(){
        double pi = Math.PI;
        double r = this.raio;

        double area = pi*r*r;
        return area;
    }

    public double getPerimetro() {
        double pi = Math.PI;
        double r = this.raio;
        double per = 2*pi*r;
        return per;
    }
    public String toString(){
        String a = "Círculo na "+ getPosString()+ "com raio de " +raio + "cm (área=" + getArea()+"cm2, perímetro="+getPerimetro()+"cm)";
        return a;
    }

}
