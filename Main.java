public class Main{
    public static void main(String[] args) {

        System.out.println("Initialization 1. (Permanent Employee):");
        PayrollManagementSystem.initPermanentEmployee(101, "Esther", 25000, 1500);

        System.out.println();


        System.out.println("Initialization 2. (Temporary Employee):");
        PayrollManagementSystem.initTemporaryEmployee(102, "John", 0, 1200, 20);
    }
}
