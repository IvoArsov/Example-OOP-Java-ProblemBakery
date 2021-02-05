package models;

public class BrownBread extends Bread {
    protected static final double pricePerItem = 1;

    public BrownBread(String name, int amount) {
        super(name, amount);
    }

    public String getName(){
        return super.getName();
    }

    public void setName(String name){
        if(!name.equals("BB")){
            throw new IllegalArgumentException("You didn't enter a valid bread name!");
        }
        super.setName(name);
    }

    @Override
    public double calculateTypePrice() {
        return this.getAmount()*pricePerItem;
    }
}
