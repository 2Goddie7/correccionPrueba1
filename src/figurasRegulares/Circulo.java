package figurasRegulares;

public class Circulo {
    private double radio;
    //Metodo constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //GETTER
    public double getRadio() {
        return radio;
    }
    //SETTER
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //Metodos personalizados
    public double areaCirculo(){ //de calculo
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
        return area;
    }
    public void perimetroCirculo(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}
