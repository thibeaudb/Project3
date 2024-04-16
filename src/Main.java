public class Main {
    public static void main(String[] args) {
        Laborer laborer = new Laborer("John", 20, 160, 10.0);
        Clerk clerk = new Clerk("Mary", 22, 2000.0);
        Executive executive = new Executive("Alice", 22, 3000.0, "SUV");

        System.out.println(laborer.name + " is entitled to " + laborer.mealVouchers() + " meal vouchers.");
        System.out.println(clerk.name + " is entitled to " + clerk.mealVouchers() + " meal vouchers.");
        System.out.println(executive.name + " is entitled to " + executive.mealVouchers() + " meal vouchers and drives a " + executive.getCompanyCarType() + ".");
    }
}

