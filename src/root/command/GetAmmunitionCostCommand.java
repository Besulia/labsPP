package root.command;

import root.Knight;
import root.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;

public class GetAmmunitionCostCommand extends Command {

    public GetAmmunitionCostCommand(Knight knight) {
        super(knight);
    }

    @Override
    public boolean execute() {
        try {
            printAmmunitionCost();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void printAmmunitionCost(){
        ArrayList<Ammunition> ammunition = new ArrayList<>();
        ammunition.add(knight.getSword());
        ammunition.add(knight.getShield());
        ammunition.add(knight.getHelmet());
        ammunition.add(knight.getGreaves());
        ammunition.add(knight.getArmour());

        for (Ammunition a : ammunition) {
            System.out.println(a.getCost() + " песо" + " - " + a.getArmorType());
        }
    }

}
