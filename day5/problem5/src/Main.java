import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(101, "Savings", 5000.0);

        System.out.println(acc.GetDetails());

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (acc.Withdraw(amount)) {
            System.out.println("Withdrawal successful! New balance: " + acc.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}