import java.util.Scanner;

public class CircumFerence {
    public static void main(String[] args){

//        circumference = 2 * Math.PI * radius;
//        area = Math.Pi * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.Pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference =  2 * Math.PI * radius;
        System.out.printf("The Circumference is: %.2f cm%n", circumference);


        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area is: %.2f cm^2%n", area);

        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume is: %.2f cm^3%n", volume);

        scanner.close();
    }
}
