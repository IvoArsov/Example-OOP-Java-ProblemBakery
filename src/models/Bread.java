package models;

public abstract class Bread {
    private String name;
    private int amount;

    public Bread(String name, int amount) {
        this.setName(name);
        this.setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount<=0){
            throw new IllegalArgumentException("The amount you entered is not correct!");
        }
        this.amount = amount;
    }

    public abstract double calculateTypePrice();
}
