package root.command;

import root.Knight;
import root.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByAmmunitionWeightCommand extends Command {

    public SortByAmmunitionWeightCommand(Knight knight) {
        super(knight);
    }

    @Override
    public boolean execute() {
        try {
            sortAmmunitionByWeight();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void sortAmmunitionByWeight() {
        ArrayList<Ammunition> ammunition = new ArrayList<>();
        ammunition.add(knight.getSword());
        ammunition.add(knight.getShield());
        ammunition.add(knight.getHelmet());
        ammunition.add(knight.getGreaves());
        ammunition.add(knight.getArmour());
        ammunition.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                Ammunition a1 = (Ammunition) o1;
                Ammunition a2 = (Ammunition) o2;
                if (a1.getWeight() < a2.getWeight()) {
                    return 1;
                }
                if (a2.getWeight() < a1.getWeight()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Ammunition a : ammunition) {
            System.out.println(a.toString() + " weight: " +a.getWeight() + "kg");
        }

    }

}
