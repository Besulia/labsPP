package root;

import root.ammunition.*;

public class Knight {
    private String name;
    private Armour armour;
    private Greaves greaves;
    private Helmet helmet;
    private Shield shield;
    private Sword sword;
    int armorProtection = 0;
    int damage = 0;
    private int health = 100;

    public Knight(String name) {
        this.name = name;
    }

    public void takeDamage(int damage){
        int finishDamage = damage - armorProtection;
        if(finishDamage > 0){
            if(health > 0){
                health = health - finishDamage;
                if(health < 0){
                    health = 0;
                }
            }
        }
    }

    private void updateAmmunitionSpecifications(){
        this.armorProtection = 0;
        this.damage = 0;
        try{
            this.armorProtection +=armour.getArmorProtection();
        }catch (NullPointerException ignored){
        }
        try{
            this.armorProtection +=greaves.getArmorProtection();
        }catch (NullPointerException ignored){
        }
        try{
            this.armorProtection +=helmet.getArmorProtection();
        }catch (NullPointerException ignored){
        }
        try{
            this.armorProtection +=shield.getArmorProtection();
        }catch (NullPointerException ignored){
        }
        try{
            this.damage +=sword.getDamage();
        }catch (NullPointerException ignored){
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
        updateAmmunitionSpecifications();
    }

    public Greaves getGreaves() {
        return greaves;
    }

    public void setGreaves(Greaves greaves) {
        this.greaves = greaves;
        updateAmmunitionSpecifications();
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
        updateAmmunitionSpecifications();
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
        updateAmmunitionSpecifications();
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
        updateAmmunitionSpecifications();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
