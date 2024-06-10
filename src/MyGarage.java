public class MyGarage {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.name = "Lamborghini Urus";
        car1.price = 30000.00;
        car1.numberOfWheels = 4;
        car1.canFly = false;
        car1.madeBy = "Bart";

        Car1 car2 = new Car1();
        car2.name = "Tesla";
        car2.price = 45000.0;
        car2.numberOfWheels = 4;
        car2.canFly = true;
        car2.madeBy = "Elon";

        Bike1 bike1 = new Bike1();
        bike1.name = "Mountainbike";
        bike1.price = 800.0;
        bike1.numberOfWheels = 2;
        bike1.canFly = false;

        System.out.println("Op dit moment staan de volgende voertuigen in de garage:");
        System.out.println(car1.name + " - " + car1.price + " euro - " + car1.numberOfWheels + " wielen - " + (car1.canFly ? "kan vliegen" : "kan niet vliegen") + " - " + car1.madeBy);
        System.out.println(car2.name + " - " + car2.price + " euro - " + car2.numberOfWheels + " wielen - " + (car2.canFly ? "kan vliegen" : "kan niet vliegen") + " - " + car2.madeBy);
        System.out.println(bike1.name + " - " + bike1.price + " euro - " + bike1.numberOfWheels + " wielen - " + (bike1.canFly ? "kan vliegen" : "kan niet vliegen"));
    }
}
