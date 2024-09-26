import java.util.Scanner;
class GeometricShapes {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose the shape to calculate volume:");
                System.out.println("1. Cylinder");
                System.out.println("2. Cube");
                int choice = scanner.nextInt();
                Shape shape = null;
                switch (choice) {
                    case 1:
                        System.out.print("Enter the radius of the cylinder: ");
                        double radius = scanner.nextDouble();
                        System.out.print("Enter the height of the cylinder: ");
                        double height = scanner.nextDouble();
                        shape = new Cylinder(radius, height);
                        break;
                    case 2:
                        System.out.print("Enter the side length of the cube: ");
                        double side = scanner.nextDouble();
                        shape = new Cube(side);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        System.exit(0);
                }
                if (shape != null) {
                    System.out.println("The volume of the chosen shape is: " + shape.calculateVolume());
                }
            }
        }