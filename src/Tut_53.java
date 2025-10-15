public class Tut_53 {
    static void update(int marks[]) {
        for (int i = 0;i<marks.length;i++ ){
            marks[i] = marks[i]+1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
    static void main() {
       int marks[] = {96,97,99};
        update(marks);
    }


}
