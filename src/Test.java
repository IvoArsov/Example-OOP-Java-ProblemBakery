import models.*;

public class Test {
    public static void main(String[] args) {
        try{
            Bread ryeBread = new RyeBread("RB", 4);
            System.out.println("Ryebread: " + ryeBread.calculateTypePrice());

            Bread multiSeedBread = new MultiSeedsBread("MB", 10);
            System.out.println("MultiSeedBread: " + multiSeedBread.calculateTypePrice());

            Bread brownBread = new BrownBread("BB", 4);
            System.out.println("BrownBread: " + brownBread.calculateTypePrice());

            double totalPrice = ryeBread.calculateTypePrice() + multiSeedBread.calculateTypePrice() + brownBread.calculateTypePrice();
            System.out.println("Total price: " + totalPrice);

            Person tim = new Person("BB", 22.0);
            System.out.println("You may buy " + tim.calculatePosibleBreadBought() + " loaves of this type of bread");

        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
