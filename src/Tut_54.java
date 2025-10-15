public class Tut_54 {
    static int linearSearch(int numbers[],int keys) {
        for (int i =1;i<numbers.length;i++){
            if (numbers[i] == keys){
            return i;
            }
        }
return -1;
    }
    static void main(String[] args) {
        int numbers[] = {20,10,58,60,48};
        int keys = 100;
       int index =  linearSearch(numbers,keys);


            if (index == -1) {
                System.out.println("not found");
            } else {
                System.out.println("number found at index " +index);
            }

    }

}
