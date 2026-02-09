import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        PI
//        System.out.println(Math.PI);
//        Exponent
//        System.out.println(Math.E);

        double result;
        result = Math.pow(2,4);
        result =  Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.49);
        result = Math.floor(3.99);
        result = Math.max(10,20);
        result = Math.min(10,20);

//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many fruits do you want to add: ");

        int amountOfFruits = scanner.nextInt();

        scanner.nextLine();

        String[] fruitsList = new String[amountOfFruits];
        int i = 0;
        while(i < fruitsList.length){
            System.out.print("Enter the food you want to add: ");
            String fruit = scanner.nextLine();
            fruitsList[i] = fruit;
            i++;
        }
        for(String fruit : fruitsList){
            System.out.println(fruit);
        }
    }
}