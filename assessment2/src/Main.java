import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insurance Number: ");
        String insuranceNo = sc.nextLine();
        System.out.print("Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.print("Amount Covered: ");
        double amountCovered = sc.nextDouble();

        System.out.println("Select Insurance Type:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = sc.nextInt();

        double premium = 0;

        if (option == 1) {

            System.out.print("Policy Term: ");
            int policyTerm = sc.nextInt();
            System.out.print("Benefit Percent: ");
            float benefitPercent = sc.nextFloat();

            LifeInsurance lifeInsurance = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            premium = addPolicy(lifeInsurance, option);
        } else if (option == 2) {

            System.out.print("Depreciation Percent: ");
            float depPercent = sc.nextFloat();

            MotorInsurance motorInsurance = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            premium = addPolicy(motorInsurance, option);
        }

        System.out.println("Calculated Premium: " + premium);
        sc.close();
    }

    public static double addPolicy(Insurance ins, int opt) {
        if (opt == 1) {
            LifeInsurance lifeIns = (LifeInsurance) ins;
            return lifeIns.calculatePremium();
        } else if (opt == 2) {
            MotorInsurance motorIns = (MotorInsurance) ins;
            return motorIns.calculatePremium();
        }
        return 0;
    }
}