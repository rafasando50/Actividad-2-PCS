public class Triangle extends Figure {
    private double length;
    private double height;

    public Triangle(int sidesNumber, double length, double height) {
        super(3);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return length * height / 2;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + length;
    }
}
