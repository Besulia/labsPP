package com.droid;

import java.util.Random;

public class Droid {
    protected String name;
    protected int health;
    protected int accuracy;
    protected boolean healer;
    public Droid(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void getHit(int damage) {
        this.health -= damage;
    }
    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                "HP='"+health+ '\''+
                '}';
    }
    public void attack(Droid target){ }
    public void receiveHit(int damage){
        this.health-=damage;
    }
    public boolean isHealer() {
        return healer;
    }
}
