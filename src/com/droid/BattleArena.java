package com.droid;
import java.util.List;
import java.util.Random;

public class BattleArena {
    Random rand=new Random();
    private final List<Droid> nulp;
    private final List<Droid> lnu;
    private List<Droid> assaulterTeam;
    private List<Droid> targetTeam;
    public BattleArena(List<Droid> nulp, List<Droid> lnu) {
        this.nulp = nulp;
        this.lnu = lnu;
    }
    public void teamFight() {
        if(checkTeams()){
            int round = 1;
            do{
                System.out.println("\nРаунд " + round++);

                pickAttackerTeam();
                for(Droid attacker : assaulterTeam){
                    if (!isTeamAlive(targetTeam)){
                        break;
                    }
                    if(attacker.isHealer()){
                        attacker.attack(pickTargetInTeam(assaulterTeam));
                    }
                    else {
                        attacker.attack(pickTargetInTeam(targetTeam));
                    }
                    removeBodies();
                }

                System.out.println(assaulterTeam.toString());
                System.out.println(targetTeam.toString());


            } while (isTeamAlive(targetTeam));
            System.out.println(nulp.contains(assaulterTeam)?"lnu виграли":"nulp виграли");

        }else {
            System.out.println("Команди не однакові за кількістю!");
        }
    }

    private void printRoundInformation(int round) {
        System.out.println("_____________________");
        System.out.println("Раунд " + round);
    }

    private void setOpponents() {
        if (new Random().nextBoolean()) {
            assaulterTeam = nulp;
            targetTeam = lnu;
        } else {
            assaulterTeam = lnu;
            targetTeam = nulp;
        }
    }
    private boolean checkTeams(){
        return nulp.size()== lnu.size();
    }
    private void pickAttackerTeam(){
        if(new Random().nextBoolean()){
            assaulterTeam=nulp;
            targetTeam=lnu;
        }
        else{
            targetTeam=nulp;
            assaulterTeam=lnu;
        }
    }
    private boolean isTeamAlive(List<Droid> team1){
        for(Droid droid:team1){
            if(droid.isAlive())
                return true;
        }
            return false;
    }
    private Droid pickTargetInTeam(List<Droid> target1){
        return target1.get(new Random().nextInt(target1.size()));
    }
    private void removeBodies(){
        targetTeam.removeIf(droid -> !droid.isAlive());
    }
}