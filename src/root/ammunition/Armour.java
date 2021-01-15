package root.ammunition;

public class Armour extends Ammunition {
    private int armorProtection;
    private Boolean wear;

    private static final int MAX_ARMOR_PROTECTION  = 25;
    private static final int MIN_ARMOR_PROTECTION  = 0;

    public Armour(int cost, int weight, String armorType,int armorProtection,Boolean wear) {
        super(cost, weight, armorType);
        this.armorProtection = armorProtection;
        this.wear = wear;
        updateArmorProtection();
    }

    private void updateArmorProtection() {
        if (armorProtection < MIN_ARMOR_PROTECTION) {
            armorProtection = MIN_ARMOR_PROTECTION;
        } else if (armorProtection > MAX_ARMOR_PROTECTION){
            armorProtection = MAX_ARMOR_PROTECTION;
        }
        if (wear) {
            armorProtection = (int) (armorProtection * 0.5);
        }
    }

    public int getArmorProtection() {
        return armorProtection;
    }

    public void setArmorProtection(int armorProtection) {
        this.armorProtection = armorProtection;
    }

    public Boolean getWear() {
        return wear;
    }

    public void setWear(Boolean wear) {
        this.wear = wear;
    }

    public static int getMaxArmorProtection() {
        return MAX_ARMOR_PROTECTION;
    }

    public static int getMinArmorProtection() {
        return MIN_ARMOR_PROTECTION;
    }

    @Override
    public String toString() {
        return "Armour{" +
                "armorProtection=" + armorProtection +
                ", wear=" + wear +
                '}';
    }
}
