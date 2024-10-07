import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter the the linkedlist  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]numbers = new int[n];
        LinkedList ll = new LinkedList();
        for(int i=0;i<n;i++){
            System.out.println("enter the number"+i);
            numbers[i]=sc.nextInt();
            ll.append(numbers[i]);
        }
        System.out.println("Original Linked List:");
        ll.display();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the node to remove (0-based index): ");
        int index = scanner.nextInt();
        ll.removeAtIndex(index);
        System.out.println("Linked List after removal:");
        ll.display();
    }
}
