package root.ammunition;

public abstract class Ammunition {

    private int weight;
    private int cost;
    private String armorType;

    public Ammunition(int cost, int weight,String armorType) {
        this.cost = cost;
        this.weight = weight;
        this.armorType = armorType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
}