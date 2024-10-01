import java.util.Scanner;

class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public Insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public double getAmountCovered() {
        return amountCovered;
    }
}

class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
    }

    public double calculatePremium() {
        idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
        return idv * 0.03;  // 3% of IDV
    }
}

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium() {
        double reducedAmount = getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100);
        return reducedAmount / policyTerm;
    }
}