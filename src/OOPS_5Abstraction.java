public class OOPS_5Abstraction {
    static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        chicken c = new chicken();

        c.eat();
        c.walk();
//        animal A = new animal(); cannot create a instance/object of an abstract clas
        System.out.println(c.color);
    }
}
abstract class animal{
    String color;
   animal(){
       color = "brown";
   }
    void eat(){               // non-abstract method
        System.out.println("animal eats");
    }
    abstract void walk();//abstract method
}
 class horse extends animal{
    void changecolor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("have 4 legs");
    }
}

class chicken extends animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("have 2 legs");
    }
}
