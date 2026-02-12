public class Main {
    public static void main(String[] args){

    }
}

class Vehicle{
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void performMaintenance(){
        System.out.println("Performing generic vehicle maintenance.");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle{
    public Car(String make, String model, int year) {
        super(make,model,year);
    }
    @Override
    public void performMaintenance(){
        System.out.println("Changing oil rotating tires for Car" +  super.getMake() + " " + super.getModel());
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int year) {
        super(make,model,year);
    }
    @Override
    public void performMaintenance(){
        System.out.println("Checking chain and tires for Motorcycle " + super.getMake() + " " + super.getModel());
    }
}