
class TemporaryEmployee extends Employee {
    int dailyWages;
    int noOfDays;


    public TemporaryEmployee(int id, String name, float basicSalary, int dailyWages, int noOfDays) {
        super(id, name, basicSalary);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }


    public void calculateNetSalaryAndBonus() {
        this.netSalary = this.dailyWages * this.noOfDays;
        this.bonus = calculateBonus();
        this.netSalary += this.bonus;
    }


    private float calculateBonus() {
        if (dailyWages < 1000) {
            return netSalary * 0.15f;
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            return netSalary * 0.12f;
        } else if (dailyWages >= 1500 && dailyWages < 1750) {
            return netSalary * 0.11f;
        } else {
            return netSalary * 0.08f;
        }
    }
}
