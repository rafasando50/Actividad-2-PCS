public class Rectangle extends Figure {
    private double length;
    private double height;

    public Rectangle(int sidesNumber, double length, double height) {
        super(4);
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
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    public void resizing(double x) {
        length *= x;
        height *= x;
    }
}
