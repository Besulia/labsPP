package root.command;

import root.Knight;
import root.ammunition.Ammunition;

import java.util.ArrayList;

public class ShowAmmunitionCommand extends Command {

    public ShowAmmunitionCommand(Knight knight) {
        super(knight);
    }

    @Override
    public boolean execute() {
        try {
            printAmmunition();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void printAmmunition() {
        ArrayList<Ammunition> ammunition = new ArrayList<>();
        ammunition.add(knight.getSword());
        ammunition.add(knight.getShield());
        ammunition.add(knight.getHelmet());
        ammunition.add(knight.getGreaves());
        ammunition.add(knight.getArmour());

        for (Ammunition a : ammunition) {
            System.out.println(a.toString() + " price: " + a.getCost() + " песо |" + " weight: " + a.getWeight() + "kg");
        }
    }
}
