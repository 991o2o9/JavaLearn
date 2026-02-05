public class Main {
    public static void main(String[] args){
        int a[];
        int b[] = new int[10];
        int c[] = {1,2,3,4,5};
//        System.out.println(a);

        for (int i = 0;i<b.length;i++){
            System.out.println(b[i]);
        }
        Book bk = new Book();
        bk.title = "Thinking in Java";
        bk.author = "Bruce Eckel";
        bk.numberOfPages = 1129;
        System.out.println(bk.title + ": " + bk.author + ": " + bk.numberOfPages);

        System.out.println("_______________________________-");
        Person person2 = new Person("Neo","male",35,"World Saver");
        Person person3 = new Person("Agent","Smith",40,"male", "single","virus");
        Person person1 = new Person("Trinity",30,"actress","married");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
//        System.out.println(person1.getFirstName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getOccupation());
//        person1.setAge(31);
//        person1.setStatus("single");
//        System.out.println(person1.getAge());
//        System.out.println(person1.getStatus());
//        System.out.println(person2);
//        System.out.println(person3);
    }
}

class Book{
    String title;
    String author;
    int numberOfPages;

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString(){
        return this.title + " " + this.author;
    }
    public boolean equals(Book b){
        if(b != null){
            if (this.author == b.author && this.title == b.title) return true; else return  false;
        }
        return false;
    }
}

class Person{
    String firstName;
    String lastName;
    int age;
    String gender;
    String status;
    String occupation;
    public Person(String firstName,int age, String occupation,String  status){
        this.firstName = firstName;
        this.age = age;
        this.status = status;
        this.occupation = occupation;
    }
    public Person(String firstName,String gender,int age,String occupation){
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }
    public Person(String firstName, String lastName,int age,String gender,String  status, String occupation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.status = status;
        this.occupation = occupation;
    }
//    getterssss
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public String getOccupation() {
        return occupation;
    }
//    settteresss
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + age + " years, " +
                gender + ", " + status + ", " + occupation;
    }
}
