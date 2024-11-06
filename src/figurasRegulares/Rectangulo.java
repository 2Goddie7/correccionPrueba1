package figurasRegulares;

public class Rectangulo {
    private double base;
    private double altura;
    //Metodo constructor
    public Rectangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }
    //GETTERS
    public double getbase() {
        return base;
    }
    public double getAltura(){
        return altura;
    }
    //SETTERS
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    //Metodos personalizados
    public double areaRectangulo(){//de calculo
        double area=base*altura;
        System.out.println("El area del rectangulo es: "+area);
        return area;
    }
    public void perimetroRectangulo(){
        double perimetro=(base+altura)*2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
