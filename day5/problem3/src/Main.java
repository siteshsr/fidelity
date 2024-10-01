import java.util.Scanner;
class Main{
    public static void main(String[] Args){
        System.out.println("Enter the value for x:");
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        System.out.println("Enter the value for y:");
        int second=sc.nextInt();
        boolean Output=true;
        if(first>second){
           Output=false;
        }
        System.out.println("The Result of whether X is less than y is "+Output);
    }
}