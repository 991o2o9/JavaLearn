import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    String ADMIN = "admin123";
    Scanner scanner = new Scanner(System.in);

    Product p1 = new Product("Bread", 3.50,10);
    Product p2 = new Product("Coffee", 10.70,20);
    Product p3 = new Product("$1 Pizza", 1.00,30);
    Product p4 = new Product("Coca Cola", 3.20,5);

    Supermarket supermarket = new Supermarket();

    supermarket.addProduct(p1);
    supermarket.addProduct(p2);
    supermarket.addProduct(p3);
    supermarket.addProduct(p4);

    System.out.println("_____________________");
    System.out.println("Welcome to 7-Eleven");
    System.out.println("_____________________");

    System.out.print("Enter password (или Enter для покупателя): ");
    String passwordInput = scanner.nextLine();

    boolean isManager = passwordInput.equals(ADMIN);

    boolean isRunning = true;
    while (isRunning){
      System.out.println("\n________________________________________");
      if (isManager){
        System.out.println("Glad to see you, MANAGER!");
        System.out.println("(1) - Show All Products");
        System.out.println("(2) - Add product");
        System.out.println("(3) - Get total price of all products");
        System.out.println("(0) - Exit");
      }
      else {
        System.out.println("Glad to see you customer!");
        System.out.println("(1) - Show All Products");
        System.out.println("(2) - Buy Product");
        System.out.println("(0) - Exit");
      }
      System.out.println("________________________________________");
      System.out.print("\nEnter you choice: ");
      String choice = scanner.nextLine();
      System.out.println();
      if (isManager){
        switch (choice){
          case "1" -> supermarket.showProducts();
          case "2" -> {
            System.out.print("Enter product name: ");
            String prTitle = scanner.nextLine();
            System.out.print("Enter " + prTitle + " price: ");
            double prPrice = scanner.nextDouble();
            System.out.print("Enter " + prTitle + " amount to add: ");
            int prQuantity = scanner.nextInt();
            scanner.nextLine();
            supermarket.addProduct(new Product(prTitle,prPrice,prQuantity));
          }
          case "3" -> supermarket.getTotalValue();
          case "0"->{
            System.out.println("Thank you!");
            isRunning = false;
          }
          default -> System.out.println("Unsupported choice, try again");
          }
        }
      else{
        switch (choice){
          case "1" -> supermarket.showProducts();
          case "2" -> {
            System.out.print("Enter product you want to buy: ");
            String prTitle = scanner.nextLine();
            System.out.print("Enter the amount: ");
            int prAmount = scanner.nextInt();
            scanner.nextLine();
            supermarket.buyProduct(prTitle,prAmount);
          }
          case "0" ->{
            System.out.println("Thank you!");
            isRunning = false;
          }
          default -> System.out.println("Unsupported choice, try again");
        }
      }
    }
  }
}