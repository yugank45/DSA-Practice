public class OOPS_6 {
    static void main(String[] args) {
     Queen q =new Queen();
     q.moves();
     King k = new King();
     k.moves();
     Bear b = new Bear();
     b.grass();
    }


}


interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,right,left,diagonal(all 4 -directions)");
    }
}
class King implements chessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,right,left,diagonal(step 1-directions)");
    }
}
class Rook implements chessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,right,left");
    }
}
class Horse implements chessPlayer{
    @Override
    public void moves() {
        System.out.println("Moves in three steps right,left");
    }
}

interface herbivore{
    public void grass();
}
interface carnivore{
    public void meat();
}
class Bear implements herbivore,carnivore{
    @Override
    public void grass() {
        System.out.println("eats grass");
    }

    @Override
    public void meat() {
        System.out.println("eats meat");
    }
}