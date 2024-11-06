package correccionPrueba1;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void areaCuadrado() {
        double area = lado * lado;
    }
    public void perimetroCuadrado() {
        double perimetro = lado * 2;
    }
}
