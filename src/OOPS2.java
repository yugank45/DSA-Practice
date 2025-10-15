public class OOPS2 {

    public static void main(String[] args) {
        Student p0 = new Student();
        Student p1 = new Student("Yugank", 20);  // passing both name and age // Parameterized Constructor
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
    }
}

    class Student {
        String name;
        int age;

        // Constructor that sets both name and age
        Student(String name, int age) {
            this.name = name;   // "this" refers to the current object
            this.age = age;
        }
        Student(){
            System.out.println("Constructor is called........");//Non Parameterized
        }
    }

