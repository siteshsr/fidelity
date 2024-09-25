public class PayrollManagementSystem {


    public static void initPermanentEmployee(int id, String name, float basicSalary, int pf) {
        PermanentEmployee permEmp = new PermanentEmployee(id, name, basicSalary, pf);
        permEmp.calculateNetSalaryAndBonus();
        permEmp.displayEmployeeInfo();
    }


    public static void initTemporaryEmployee(int id, String name, float basicSalary, int dailyWages, int noOfDays) {
        TemporaryEmployee tempEmp = new TemporaryEmployee(id, name, basicSalary, dailyWages, noOfDays);
        tempEmp.calculateNetSalaryAndBonus();
        tempEmp.displayEmployeeInfo();
    }
}