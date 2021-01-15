package root.command;

import root.Knight;
import root.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortBytAmmunitionCostCommand extends Command {

    public SortBytAmmunitionCostCommand(Knight knight) {
        super(knight);
    }

    @Override
    public boolean execute() {
        try {
            sortAmmunitionByCost();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private void sortAmmunitionByCost() {
        ArrayList <Ammunition> ammunition = new ArrayList<>();
        ammunition.add(knight.getSword());
        ammunition.add(knight.getShield());
        ammunition.add(knight.getHelmet());
        ammunition.add(knight.getGreaves());
        ammunition.add(knight.getArmour());
        ammunition.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                Ammunition a1 = (Ammunition) o1;
                Ammunition a2 = (Ammunition) o2;
                if (a1.getCost() > a2.getCost()) {
                    return 1;
                }
                if (a2.getCost() > a1.getCost()) {
                    return -1;
                }
                return 0;
            }
        });

        for(Ammunition a:ammunition){
            System.out.println(a.toString() + " price " + a.getCost() + " песо");
        }

    }

}
