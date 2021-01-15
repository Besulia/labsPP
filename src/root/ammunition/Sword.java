package root.ammunition;

public class Sword extends Ammunition {

    private int damage;
    private Boolean wear;

    private static final int MAX_DAMAGE = 25;
    private static final int MIN_DAMAGE = 0;

    public Sword(int cost, int weight, String armorType, int damage, Boolean wear) {
        super(cost, weight, armorType);
        this.wear = wear;
        this.damage = damage;
        updateDamage();
    }

    private void updateDamage() {
        if (damage < MIN_DAMAGE) {
            damage = MIN_DAMAGE;
        } else if (damage > MAX_DAMAGE){
            damage = MAX_DAMAGE;
        }
        if (wear) {
            damage = (int) (damage * 0.5);
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Boolean getWear() {
        return wear;
    }

    public void setWear(Boolean wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "damage=" + damage +
                ", wear=" + wear +
                '}';
    }
}
