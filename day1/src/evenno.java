import java.util.Scanner;

public class evenno {
    public static void main(String[] args) {
        System.out.println("enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []num = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(num[i]%2==0){
                sum+=num[i];
            }
        }
        System.out.println(sum);
    }
}
