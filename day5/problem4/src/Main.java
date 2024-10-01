import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        byte number;
        Scanner sc =new Scanner(System.in);
        number= Byte.parseByte(sc.next());

        System.out.println("Value of number: " + number);

        System.out.println("Largest value stored in a signed byte: " + Byte.MAX_VALUE);
    }
}