package com.droid;

import java.util.Random;

public class Damager extends Droid {
    private int agility;  //спритність
    private int damage;
    public Damager(String name, int health, int damage) {
        super(name, health);
        this.agility = 25;
        this.accuracy = 70;
        this.healer=false;
        this.damage=damage;
    }
    public int getAgility() {
        return agility;
    }
    @Override
    public void attack(Droid target){
        if(target.getAccuracy()>new Random().nextInt(101)){
            if(agility> new Random().nextInt(101)){
                System.out.println("В "+this.name+" не попали");
            }
            else
                target.getHit(damage);
        }
        else
            System.out.println(target.name+" ухилився");
    }
}

