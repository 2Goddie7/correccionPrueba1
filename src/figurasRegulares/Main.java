package figurasRegulares;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        //CUADRADO
        System.out.println("*** CALCULAR AREA Y PERIMETRO DE UN CUADRADO ***");
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = input.nextDouble();
        Cuadrado f1 = new Cuadrado(lado);
        System.out.println("El lado del cuadrado es → "+f1.getLado());
        double areaCuadrado = f1.areaCuadrado();
        f1.perimetroCuadrado();

        //RECTANGULO
        System.out.println("*** CALCULAR AREA Y PERIMETRO DE UN RECTANGULO ***");
        System.out.print("Ingrese la base del rectangulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();
        Rectangulo f2 = new Rectangulo(base, altura);
        System.out.println("La base del rectangulo es → "+f2.getbase());
        System.out.println("La altura del rectangulo es → "+f2.getAltura());
        double areaRectangulo = f2.areaRectangulo();
        f2.perimetroRectangulo();

        //TRIANGULO
        System.out.println("*** CALCULAR AREA Y PERIMETRO DE UN TRIANGULO EQUILATERO ***");
        System.out.print("Ingrese el lado(base) del triangulo: ");
        double ladoT = input.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double alturaT = input.nextDouble();
        Triangulo f3 = new Triangulo(ladoT, alturaT);
        System.out.println("El lado del triangulo equilatero es → "+f3.getLado());
        double areaTriangulo = f3.areaTriangulo();
        f3.perimetroTriangulo();

        //CIRCULO
        System.out.println("*** CALCULAR AREA Y PERIMETRO DE UN CIRCULO ***");
        System.out.print("Ingrese el radio del circulo: ");
        double radio = input.nextDouble();
        Circulo f4 = new Circulo(radio);
        System.out.println("El radio del circulo es → "+f4.getRadio());
        double areaCirculo = f4.areaCirculo();
        f4.perimetroCirculo();

        //Metodo para la suma de todas las areas
        System.out.println();
        double areaTotal = areaCuadrado + areaRectangulo + areaTriangulo + areaCirculo;
        System.out.println("La sumatoria de las áreas de las cuatro figuras es: " + areaTotal);
    }
}