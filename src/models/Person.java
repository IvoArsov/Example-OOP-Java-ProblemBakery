package models;

public class Person {
    private String nameOfBread;
    private double money;

    public Person(String nameOfBread, double money) {
        this.setNameOfBread(nameOfBread);
        this.setMoney(money);
    }

    public String getNameOfBread() {
        return nameOfBread;
    }

    public void setNameOfBread(String nameOfBread) {
        this.nameOfBread = nameOfBread;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money <= 0){
            throw new IllegalArgumentException("Money must be a positive value!");
        }
        this.money = money;
    }

    public int calculatePosibleBreadBought(){
        int posibleBuyings = 0;

        switch (this.getNameOfBread()){
            case "RB":
                posibleBuyings = (int)(this.getMoney() / RyeBread.pricePerItem);
                break;
            case "MB":
                posibleBuyings = (int)(this.getMoney() / MultiSeedsBread.pricePerItem);
                break;
            case "BB":
                posibleBuyings = (int)(this.getMoney() / BrownBread.pricePerItem);
                break;
            default: throw new IllegalArgumentException("We don't sell such type of bread, sorry!");
        }

        return posibleBuyings;
    }
}
