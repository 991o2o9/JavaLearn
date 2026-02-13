import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
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

    supermarket.showProducts();
    supermarket.buyProduct("Bread",8);
    supermarket.showProducts();
    supermarket.getTotalValue();
    boolean isRunning = true;
    while (isRunning){

    }
  }
}

class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price,int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString(){
    return name + " - $" + price + " - " + quantity;
  }
}

class Supermarket{
  ArrayList<Product> products;

  public Supermarket() {
     products = new ArrayList<>();
  }

  public Product findProductByName(String name) {
    for (Product prod : products) {
      if (prod.getName().equalsIgnoreCase(name)) {
        return prod;
      }
    }
    return null;
  }

  public void addProduct(Product product){
    if (product == null){
      return;
    }
    Product foundProduct = findProductByName(product.getName());
    if (foundProduct != null){
      foundProduct.setQuantity(foundProduct.getQuantity() + product.getQuantity());
    }
    else {
      products.add(product);
    }
  }

  public void showProducts(){
    if (products.isEmpty()){
      System.out.println("No Products");
    }
    for (Product prod : products){
      System.out.println(prod);
    }
  }

  public void buyProduct(String name, int amount){
    Product foundProduct = this.findProductByName(name);
    if (foundProduct == null){
      System.out.println("Product not found");
    }
    if (amount > foundProduct.getQuantity()){
      System.out.println("We don't have this amount of " + name);
    }
    foundProduct.setQuantity(foundProduct.getQuantity() - amount);
  }

  public void getTotalValue(){
    double sumOfProducts = 0;
    for (Product prod : products){
      sumOfProducts += prod.getPrice();
    }
    System.out.println("Total price of all products is: $" + sumOfProducts);
  }
}