import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        check(age);
    }
    public static void check(int age) {
        if (age < 18) {
            System.out.println("You are not eligible to vote");
        }
        else if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
    }
}
