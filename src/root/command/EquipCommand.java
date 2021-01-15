package root.command;

import root.Knight;
import root.ammunition.*;

public class EquipCommand extends Command {

    private Armour armour;
    private Greaves greaves;
    private Helmet helmet;
    private Shield shield;
    private Sword sword;

    public EquipCommand(Knight knight, Armour armour, Greaves greaves, Helmet helmet, Shield shield, Sword sword) {
        super(knight);
        this.armour = armour;
        this.greaves = greaves;
        this.helmet = helmet;
        this.shield = shield;
        this.sword = sword;
    }

    @Override
    public boolean execute() {
        try{
            backup();
            knight.setArmour(armour);
            knight.setGreaves(greaves);
            knight.setHelmet(helmet);
            knight.setShield(shield);
            knight.setSword(sword);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
