public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Lamborghini", "Urus", 2021, "Black");

        System.out.println("Merk: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Jaar: " + myCar.getYear());
        System.out.println("Kleur: " + myCar.getColor());
    }
}

