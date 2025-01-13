// Subclass of Emolument for additional calculations
public class MyEmolument extends Emolument {
    // Default constructor with 0 values
    public MyEmolument() {
        super(0, 0);
    }

    // Constructor with specified values
    public MyEmolument(double basicSalary, double taxRelief) {
        super(basicSalary, taxRelief);
    }

    // Calculate income tax based on taxable income
    public double incomeTax() {
        double taxableIncome = taxableIncome();
        double tax = 0;

        if (taxableIncome <= 500) {
            tax = 0.05 * taxableIncome;
        } else if (taxableIncome <= 1000) {
            tax = (0.05 * 500) + (0.125 * (taxableIncome - 500));
        } else {
            tax = (0.05 * 500) + (0.125 * 500) + (0.175 * (taxableIncome - 1000));
        }

        return tax;
    }

    // Compute total deductions
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

    // Compute net salary
    public double netSalary() {
        return getBasicSalary() - totalDeduction();
    }
}
