public class OOPS4 {
    static void main(String[] args) {
        Fish fish =new Fish();
        fish.eat();
        fish.breathe();
        fish.swim();
        shark shark =new shark();
        shark.eat();
        shark.size = 90;
        System.out.println(shark.size);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}
class shark extends Fish{
    int size;
}