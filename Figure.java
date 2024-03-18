public abstract class Figure {
    private int sidesNumber;

    public Figure(int sidesNumber) {
        this.sidesNumber = sidesNumber;
    }

    public int getSidesNumber() {
        return sidesNumber;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
