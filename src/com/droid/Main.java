package com.droid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<Droid> droids = new ArrayList();

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        createdDroids();
        while(selectAction());
    }

    private static boolean selectAction() throws IOException {
        System.out.println("1 - створити дроїда");
        System.out.println("2 - показати список створених дроїдів");
        System.out.println("3 - запустити бій 1 на 1");
        System.out.println("4 - запустити бій команда на команду");
        System.out.println("5 - вийти з програми");

        System.out.print("Select number of action: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(bufferedReader.readLine());
        switch (index) {
            case 1:
                addDroid();
                break;
            case 2:
                printDroids();
                break;
            case 3:
                battle1x1();
                break;
            case 4:
                teamBattle();
                break;
            case 5:
                return false;
            default:
                System.out.println("НЕПРАВИЛЬНЕ ВВЕДЕННЯ!!!");
        }
        return true;
    }

    private static void createdDroids() {
        Random rand = new Random();
        Droid droid1 = new Damager("Headhunter", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid2 = new Damager("Soldier", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid3 = new Damager("Scorpion", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid5 = new Damager("SubZero", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid6 = new Damager("Sonia Blade", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid7 = new Damager("Raiden", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droid8 = new Damager("Reptile", rand.nextInt(80) + 20, rand.nextInt(10) + 1);
        Droid droidHealer = new DD("Dim Dimych", rand.nextInt(80) + 20, 5);
        droids.add(droid1);
        droids.add(droid7);
        droids.add(droidHealer);
        droids.add(droid8);
        droids.add(droid2);
        droids.add(droid5);
        droids.add(droid3);
        droids.add(droid6);
    }

    public static void addDroid() {
        Scanner in = new Scanner(System.in);
        String name;
        int hp;
        System.out.print("Введіть ім'я дроіда: ");
        name = in.nextLine();
        System.out.print("Введіть HP дроіда: ");
        hp = in.nextInt();
        System.out.print("Введіть тип дроіда(1-damager, 2-doctor): ");
        int type = in.nextInt();
        switch (type) {
            case 1:
                System.out.print("Введіть силу удара дроіда: ");
                int damage = in.nextInt();
                droids.add(new Damager(name, hp, damage));
                break;
            case 2:
                System.out.print("Введіть кількість плюсіків для роздачі: ");
                int plusNumber = in.nextInt();
                droids.add(new DD(name, hp, plusNumber));
                break;
            default:
                System.out.println("Введіть 1 або 2!!!");
        }
    }
    public static void printDroids(){
        for (int i = 0; i <droids.size() ; i++) {
            System.out.println((i+1)+". "+droids.get(i));
        }
    }
    public static void battle1x1(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> droid1=new ArrayList();
        List<Droid> droid2=new ArrayList();
        System.out.println("Оберіть першого дроїда:");
        printDroids();
        droid1.add(droids.get(scanner.nextInt()-1));
        System.out.println("Оберіть другого дроїда:");
        printDroids();
        droid2.add(droids.get(scanner.nextInt()-1));
        BattleArena oneXone = new BattleArena(droid1, droid2);
        oneXone.teamFight();
    }
    public static void teamBattle(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> droid1=new ArrayList();
        List<Droid> droid2=new ArrayList();
        int id;
        System.out.println("Оберіть дроїдів для 1-ї команди nulp (0-кінець введення): ");
        printDroids();
        while (true){
            id=scanner.nextInt();
            if(id>0)
                droid1.add(droids.get(id-1));
            else
                break;
        }
        System.out.println("Оберіть дроїдів для 2-ї команди lnu (0-кінець введення): ");
        printDroids();
        while (true){

            id=scanner.nextInt();
            if(id>0)
                droid2.add(droids.get(id-1));
            else
                break;
        }
        BattleArena battleofteams = new BattleArena(droid1, droid2);
        battleofteams.teamFight();
    }
}
