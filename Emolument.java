// Class representing the basic emolument
public class Emolument {
    private double basicSalary; // Encapsulated basic salary
    private double taxRelief;   // Encapsulated tax relief

    // Constructor to initialize basic salary and tax relief
    public Emolument(double basicSalary, double taxRelief) {
        this.basicSalary = basicSalary;
        this.taxRelief = taxRelief;
    }

    // Getter for basic salary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Getter for tax relief
    public double getTaxRelief() {
        return taxRelief;
    }

    // Compute SSNIT contribution (3.5% of basic salary)
    public double SSNIT() {
        return 0.035 * basicSalary;
    }

    // Compute taxable income
    public double taxableIncome() {
        return basicSalary - (taxRelief + SSNIT());
    }
}
