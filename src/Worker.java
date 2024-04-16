
class Worker {
    protected String name;
    protected int workedDays;

    public Worker(String name, int workedDays) {
        this.name = name;
        this.workedDays = workedDays;
    }

    public int mealVouchers() {
        return workedDays;
    }
}


class Laborer extends Worker {
    private int workedHours;
    private double hourlyWage;

    public Laborer(String name, int workedDays, int workedHours, double hourlyWage) {
        super(name, workedDays);
        this.workedHours = workedHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public int mealVouchers() {
        return super.mealVouchers();
    }

    public double calculateSalary() {
        return workedHours * hourlyWage;
    }
}


class Clerk extends Worker {
    private double monthlySalary;

    public Clerk(String name, int workedDays, double monthlySalary) {
        super(name, workedDays);
        this.monthlySalary = monthlySalary;
    }
    public int mealVouchers() {
        return super.mealVouchers();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

// Subclass Executive
class Executive extends Clerk {
    private String companyCarType;

    public Executive(String name, int workedDays, double monthlySalary, String companyCarType) {
        super(name, workedDays, monthlySalary);
        this.companyCarType = companyCarType;
    }

    public String getCompanyCarType() {
        return companyCarType;
    }
}



