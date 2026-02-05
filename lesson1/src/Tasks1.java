    public class Tasks1 {
        public static void main(String[] args) {
    //      task 1
            int age = 18;
            double height = 1.84;
            boolean isStudent = true;
            char firstLetter = 'A';
            String name = "Amin";

            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println("height: "+height);
            System.out.println("is student: "+isStudent);
            System.out.println("first letter of name: "+firstLetter);
            System.out.println("______________________________");
    //      task 2
            int value1 = 7;
            int division1 = value1 / 2;
            System.out.println("int деление: " + division1);
            double turnDouble =  (double) value1 / 2;
            System.out.println("double деление" + turnDouble);
            System.out.println("______________________________");
            // объяснение:
            // когда мы делим int на int дробная часть уходит 7 / 2 = 3
            // при приведении к double деление происходит с плавающей точкой
            // поэтому сохраняется дробная часть 7 / 2 = 3.5
    //      task 3
            int val1 = 10;
            int val2 = 20;
            int sum = val1 + val2;
            int subtraction = val1 - val2;
            int multiplication = val1 * val2;
            double division = (double) val1 / val2;
            int remainder = val1 % val2;

            System.out.println("summa: " + sum);
            System.out.println("subtraction: " + subtraction);
            System.out.println("multiplication: " + multiplication);
            System.out.println("division: " + division);
            System.out.println("reminder: " + remainder);
            System.out.println("______________________________");
//          task 4
            int age1 = 19;
            boolean hasStudentCard = false;

            if (age1 < 18 || hasStudentCard) {
                System.out.println("Discount allowed");
            } else {
                System.out.println("No discount");
            }
            System.out.println("______________________________");
//          task 5
            int randomNum = 90;

            if (randomNum >= 90 && randomNum <= 100) {
                System.out.println("ur grade: A");
            } else if (randomNum >= 80 && randomNum <= 89) {
                System.out.println("ur grade: B");
            } else if (randomNum >= 70 && randomNum <= 79) {
                System.out.println("ur grade: C");
            } else if (randomNum >= 60 && randomNum <= 69) {
                System.out.println("ur grade: D");
            } else {
                System.out.println("ur grade: F");
            }
            System.out.println("______________________________");
//          task 6
            int day = 4;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
            System.out.println("______________________________");
//          task 7
            for (int i = 1;i <= 10;i++){
                System.out.println(i);
            }
            System.out.println("******************");
            for (int i = 0;i <= 20;i = i + 2){
                System.out.println(i);
            }
            System.out.println("______________________________");
//          task 8
            int n_num = 5;
            int result = 0;
            for (int i = 0;i <= n_num;i++){
                result += i;
            }
            System.out.println(result);
            System.out.println("______________________________");
//          task 9
            int multiplication_num = 3;
            for (int i = 1;i<= 10;i++) {
                System.out.println(multiplication_num + "*" + i + "=" + 3 * i);
            }
            System.out.println("______________________________");
//          task 10
            int number10 = 17;
            boolean isPrime = true;
            if (number10 < 2) {
                System.out.println("Not prime");
            } else{
                for (int i = 2;i<number10 /2;i++){
                    if (number10 % 2 == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println(number10 + " - is prime");
            }else{
                System.out.println(number10 + " - is not prime");
            }
            System.out.println("______________________________");
//          task 11
            int given_num = 5;
            long result11 = 1;
            for (int i = 1;i<=given_num; i++){
                result11 *= i;
            }
            System.out.println(result11);
        }
    }

