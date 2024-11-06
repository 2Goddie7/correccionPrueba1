package figurasRegulares;

public class Triangulo {
    //Para un triangulo equilatero
    private double lado;
    private double altura;
    //Metodo constructor
    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    //GETTERS
    public double getLado(){
        return lado;
    }
    public double getAltura(){
        return altura;
    }
    //SETTERS
    public void setLado(double lado){
        this.lado=lado;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    //Metodos personalizados
    public double areaTriangulo(){//de calculo
        double area=(lado*altura)/2;
        System.out.println("El area del triangulo es: "+area);
        return area;
    }
    public void perimetroTriangulo(){
        double perimetro=lado*3;
        System.out.println("El perimetro del triangulo es: "+perimetro);
    }
}
