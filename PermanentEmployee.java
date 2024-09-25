class PermanentEmployee extends Employee {
    int pf;


    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        super(id, name, basicSalary);
        this.pf = pf;
    }


    public void calculateNetSalaryAndBonus() {
        this.netSalary = this.basicSalary - this.pf;
        this.bonus = calculateBonus();
        this.netSalary += this.bonus;
    }


    private float calculateBonus() {
        if (pf < 1000) {
            return basicSalary * 0.10f;
        } else if (pf >= 1000 && pf < 1500) {
            return basicSalary * 0.115f;
        } else if (pf >= 1500 && pf < 1800) {
            return basicSalary * 0.12f;
        } else {
            return basicSalary * 0.15f;
        }
    }
}