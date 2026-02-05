import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в управление студентами!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to add? ");
        int studentsCount = scanner.nextInt();
        StudentUtils studentList = new StudentUtils(studentsCount);
        scanner.nextLine();

        int i = 0;
        while (i < studentsCount) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Error: student name cannot be empty");
                continue;
            }

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();

            if (age < 16) {
                System.out.println("Error: invalid student age");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter student gpa: ");
            double gpa = scanner.nextDouble();

            if (gpa < 0 || gpa > 4) {
                System.out.println("Error: invalid student gpa");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            System.out.print("Enter student major: ");
            String major = scanner.nextLine();

            if (major.isEmpty()) {
                System.out.println("Error: student major cannot be empty");
                continue;
            }

            Student newStudent = new Student(name, age, gpa, major);
            studentList.studentList[i] = newStudent;
            System.out.println("Student added!");
            i++;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Display all students");
            System.out.println("2. Display excellent students (GPA >= 3.5)");
            System.out.println("3. Calculate average GPA");
            System.out.println("4. Search student by name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentList.printStudents();
                    break;
                case 2:
                    System.out.println("Excelent Student");
                    boolean fountExcelent = false;
                    for (Student s : studentList.studentList){
                        s.displayInfo();
                        fountExcelent = true;
                    }
                    if(!fountExcelent) System.out.println("No excelent student found");
                    break;
                case 3:
                    double avg = studentList.calculateAverageGpa();
                    System.out.printf("Average GPA of all students: %.2f\n", avg);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean foundName = false;
                    for (Student s : studentList.studentList) {
                        if (s != null && s.getName().equals(searchName)) {
                            s.displayInfo();
                            foundName = true;
                        }
                    }
                    if (!foundName) System.out.println("Student not found.");
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();scanner.close();

    }


}

class Student {
    private String name;
    private int age;
    private double gpa;
    private String major;

    public Student(String name, int age, double gpa, String major) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public void displayInfo(){
        System.out.println("Name:" + " " + this.name + "," + " " +  "Age:" + " " + this.age + " " + "GPA:" + " " + this.gpa + " " + this.major);
    }
    public boolean isExcellent(){
        if(this.gpa >= 3.5) return true; else return false;
    }

}

class StudentUtils {

    Student[] studentList;

    public StudentUtils(int n) {
        studentList = new Student[n];
    }

    public void printStudents() {
        System.out.println("List of all students:");

        for (Student s : studentList) {
            if (s != null) {
                s.displayInfo();
            }
        }
    }

    public void printStudentsFilGpa(double minGpa) {
        System.out.println("Students with GPA below " + minGpa + ":");
        boolean found = false;
        for (Student s : studentList) {
            if (s != null && s.getGpa() < minGpa) {
                s.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found below GPA " + minGpa);
        }
    }

    public double calculateAverageGpa() {
        double sum = 0;
        int count = 0;
        for (Student s : studentList) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return (count == 0) ? 0 : sum / count;
    }
}
