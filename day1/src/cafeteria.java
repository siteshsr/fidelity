import java.util.Scanner;

public class cafeteria {
    public static void main(String[] args) {
        System.out.println("enter no.of pizza");
        Scanner sc = new Scanner(System.in);
        int pizza = sc.nextInt();
        System.out.println("enter no.of puffs");
        int puffs = sc.nextInt();
        System.out.println("enter no.of pepsi");
        int pepsi = sc.nextInt();
        int sum=pizza*200+puffs*40+pepsi*120;
        System.out.println("bill="+sum);
    }
}
