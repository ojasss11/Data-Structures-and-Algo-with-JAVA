import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String[] args) {
        // Income Slab Applicable Tax Rate
        // Up to Rs 3 lakh -->Nil
        // Above Rs 3 lakh and up to Rs 6 lakh--> 5%
        // Above Rs 6 lakh and up to Rs 9 lakh--> 10%
        // Above Rs 9 lakh and up to Rs 12 lakh--> 15%
        // Above Rs 12 lakh and up to Rs 15 lakh--> 20%
        // Above Rs 15 lakh -->30%
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INCOME: ");
        float income = sc.nextFloat();
        float tax;
        if (income <= 3_00_000) {
            tax = income * 0;
        } else if (income > 300000 && income < 600000) {
            tax = income * 0.05f;
        } else if (income > 600000 && income < 900000) {
            tax = income * 0.10f;
        } else if (income > 900000 && income < 1200000) {
            tax = income * 0.15f;
        } else if (income > 1200000 && income < 1500000) {
            tax = income * 0.2f;
        } else if (income > 1500000) {
            tax = income * 0.3f;
        } else {
            tax = 0;
        }
        System.out.println("THE TAX IS :" + tax);

    }
}