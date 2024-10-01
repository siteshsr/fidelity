import java.util.Scanner;
class Main{
    public static void main(String[] Args){
        int number;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        double square=square(number);
        System.out.println("The square of "+number+" is "+square);
        double cube=cube(number);
        System.out.println("The cube of "+number+" is "+cube);
    }
    public static double square(double x){
        return x*x;
    }
    public static double cube(double x){
        return x*x*x;
    }
}