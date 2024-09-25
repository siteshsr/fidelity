import java.util.Scanner;

class vehicle {
   void vehiclename(){
       System.out.println("enter vehicle name");
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println(" vehicle name is "+name);
    }

}
class car extends vehicle{
    void model(){
        System.out.println("enter model");
        Scanner sc = new Scanner(System.in);
        String carmodel = sc.nextLine();
        System.out.println(" vehicle model is "+carmodel);
    }
}
class display extends car{
    void display(){
        car car1 = new car();
        car1.vehiclename();
        car1.model();
    }
    }
        class multilevel {
    public static void main(String[] args) {
        display obj = new display();
        obj.display();

    }
        }
