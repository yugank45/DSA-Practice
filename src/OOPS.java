public class OOPS {
   public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
       System.out.println(p1.color);
       p1.setTip(5);
       p1.color = "Yellow";
       System.out.println(p1.color);
       System.out.println(p1.tip);

       BankAccount myAcc = new BankAccount();
       myAcc.username = "Yugank Singh";
      myAcc.setPassword("rjrbjfnjnr");
    }

    static class BankAccount{
       public String username;
       private String password;

        protected void setPassword(String password) {
            this.password = password;
        }
    }


    static class Pen{
        String color;
        int tip;

         void setColor(String newColor) {
             color = newColor;

        }
        void setTip(int newTip){
             tip = newTip;
        }
    }


}
