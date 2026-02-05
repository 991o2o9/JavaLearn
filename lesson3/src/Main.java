public class Main {
    public static void main(String[] args){
    Student s1 = new Student("Amin",18);
    s1.displayInfo();
    System.out.println(s1.isExcellent());
    Student s3 = new Student("Aktan",22,4.0);
    s3.displayInfo();
    System.out.println(s3.isExcellent());
    Student.displayStudentCount();
    }
}

class Student{
    private String name;
    private int age;
    private double gpa;
    static int numberStudents = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gpa = 0.0;
        numberStudents++;
    }
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        numberStudents++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Name:" + " " + this.name + "," + " " +  "Age:" + " " + this.age + " " + "GPA:" + " " + this.gpa);
    }
    public boolean isExcellent(){
        if(this.gpa >= 3.5) return true; else return false;
    }
    public static void displayStudentCount(){
        System.out.println(numberStudents);
    }
}