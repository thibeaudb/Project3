public class Circle extends Figure {
    private double diameter;

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getPerimeter() {
        return Math.PI * diameter;
    }

    public double getArea() {
        return Math.PI * Math.pow(diameter / 2, 2);
    }
}
