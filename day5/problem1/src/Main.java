import java.util.Scanner;
public class Main{
    public static void main(String [] Args){
        System.out.println("Enter Your name:");
        Scanner Sc =new Scanner(System.in);
        String name=Sc.nextLine();
        System.out.println("Enter Your Age:");
        int age=Sc.nextInt();
        System.out.println("Enter your Country");
        String country=Sc.next();
        System.out.println("Welcome "+name+"."+"Your age is "+age+" and you are from "+country);


    }
}