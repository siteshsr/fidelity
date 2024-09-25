
class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;


    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = 0;
        this.netSalary = 0;
    }


    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}



