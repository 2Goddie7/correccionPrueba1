package figurasRegulares;

public class Cuadrado {
    private double lado;
    //Metodo constructor
    public Cuadrado(double lado) {
        this.lado=lado;
    }
    //GETTER
    public double getLado() {
        return lado;
    }
    //SETTER
    public void setLado(double lado) {
        this.lado = lado;
    }
    //Metodos personalizados
    public double areaCuadrado() {//de calculo
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
        return area;
    }
    public void perimetroCuadrado() {
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
