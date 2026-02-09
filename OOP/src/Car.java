public class Car {
    private String make = "Toyota";
    private String model = "Camry";
    private String year = "2025";
    private double price = 300200.99;
    private boolean isRunning = false;

//    public Car(String make, String year, boolean isRunning, double price) {
//        this.make = make;
//        this.year = year;
//        this.isRunning = isRunning;
//        this.price = price;
//    }
    @Override
    public String toString(){
        return make + " , " + year + " , $" + price + " , " + isRunning;
    }
}
