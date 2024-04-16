public class Figure {
    protected String name;
    public Figure(String name) {
        this.name = name;
    }
    public class Circle {
        private double diameter;
        public Circle(double diameter) {
            Figure.this.name = "Circle";
            this.diameter = diameter;
        }
        public double calculateCircumference() {
            return Math.PI * diameter;
        }
        public double calculateArea() {
            double radius = diameter / 2;
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Figure myFigure = new Figure("My Figure");
        Figure.Circle myCircle = myFigure.new Circle(10);
        System.out.println("Name of the circle: " + myFigure.name);
        System.out.println("Diameter of the circle: " + myCircle.diameter);
        System.out.println("Circumference of the circle: " + myCircle.calculateCircumference());
        System.out.println("Area of the circle: " + myCircle.calculateArea());
    }
}

