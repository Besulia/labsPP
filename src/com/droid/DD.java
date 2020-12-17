package com.droid;

public class DD extends Droid {
    private int plusNumber;
    public DD(String name, int health, int plusNumber) {
        super(name, health);
        this.plusNumber = plusNumber;
        this.healer=true;
        this.accuracy=80;
    }

    public int getPlusNumber() {
        return plusNumber;
    }
    @Override
    public void attack(Droid target){
        target.health+= plusNumber;
        System.out.println(this.name+" кинув плюсік (додав HP) до "+target.name);
    }

}
