import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        Triangle triangle = new Triangle(3, 10, 15);
        Rectangle rectangle = new Rectangle(4, 20, 10);

        Rectangle rectangulo = new Rectangle(4, 4, 3);
        System.out.println("El area del rectangulo es " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es " + rectangulo.getPerimeter());
        rectangulo.resizing(3);
        System.out.println("El area del rectangulo es " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es " + rectangulo.getPerimeter());
    }
}