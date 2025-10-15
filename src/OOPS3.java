

//copy constructor
public class OOPS3 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.roll_no = 90;
        s1.name = "Yugank";
        s1.password = "abbs";


        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 60;
        Students s2 = new Students(s1);
        s1.password = "bmss";



        for (int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Students{
    String name;
    int roll_no;
    String password;
    int marks[];
//Shallow Copy Constructor
//    public Students(Students s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll_no = s1.roll_no;
//        this.marks = s1.marks;
//
//
//    }

//    DEEP COPY CONSTRUCTOR
    Students(Students s1){
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        this.marks = s1.marks;
        for (int  i =0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Students(){
        marks = new int[3];
        System.out.println("Constructor is called.......................");

    }

    Students(String name){
        marks = new int[3];
        this.name =name;
    }
    Students(int roll_no){
        marks = new int[3];
        this.roll_no = roll_no;
    }

}





