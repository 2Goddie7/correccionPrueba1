package correccionPrueba1;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public double getbase() {
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base=base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public void areaRectangulo(){
        double area=base*altura;
    }

    public void perimetroRectangulo(){
        double perimetro=(base+altura)*2;
    }
}
