import java.util.ArrayList;

class Supermarket{
    private ArrayList<Product> products;

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
        for (int i = 0;i<products.size();i++){
            System.out.println(i+1+ ". " + products.get(i));
        }
    }

    public void buyProduct(String name, int amount){
        if(amount<=0){
            System.out.println("Amount must be positive");
            return;
        }
        Product foundProduct = this.findProductByName(name);
        if (foundProduct == null){
            System.out.println("Product not found");
            return;
        }
        if (amount > foundProduct.getQuantity()){
            System.out.println("We don't have this amount of " + name);
            System.out.println("Available: " + foundProduct.getQuantity() + ", requested: " + amount);
            return;
        }
        foundProduct.setQuantity(foundProduct.getQuantity() - amount);
    }

    public void getTotalValue(){
        double sumOfProducts = 0;
        for (Product prod : products){
            sumOfProducts += prod.getPrice() * prod.getQuantity();
        }
        System.out.println("Total price of all products is: $" + sumOfProducts);
    }
}