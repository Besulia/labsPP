package root;

import root.ammunition.*;
import root.command.*;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я лицаря");
        String name = scanner.nextLine();
        Knight knight = new Knight(name);
        boolean menuFlag = true;
        while (menuFlag) {
            System.out.println("1. Екіпірувати лицаря\n\n2. Сортувати амуніцію за вагою\n3. Сортувати амуніцію за ціною\n4. Вивести ціну елементів екіпіровки\n" +
                    "5. Вивести екіпіровку\n6. Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    Armour armour = new Armour(500, 25, "Armour", 19, false);
                    Greaves greaves = new Greaves(300, 15, "Greaves", 10, false);
                    Helmet helmet = new Helmet(100, 21, "Helmet", 9, true);
                    Shield shield = new Shield(240, 7, "Shield", 41, false);
                    Sword sword = new Sword(900, 6, "Sword", 20, false);
                    EquipCommand equipCommand = new EquipCommand(knight, armour, greaves, helmet, shield, sword);
                    if (equipCommand.execute()) {
                        System.out.println("Лицар " + knight.getName() + " успішно екіпірований");
                    } else {
                        System.out.println("error");
                    }
                    break;
                }
                case "2": {
                    SortByAmmunitionWeightCommand sortByAmmunitionWeightCommand = new SortByAmmunitionWeightCommand(knight);
                    sortByAmmunitionWeightCommand.execute();
                    break;
                }
                case "3": {
                    SortBytAmmunitionCostCommand sortBytAmmunitionCostCommand = new SortBytAmmunitionCostCommand(knight);
                    sortBytAmmunitionCostCommand.execute();
                    break;
                }
                case "4": {
                    GetAmmunitionCostCommand getAmmunitionCostCommand = new GetAmmunitionCostCommand(knight);
                    getAmmunitionCostCommand.execute();
                    break;
                }case "5": {
                    ShowAmmunitionCommand showAmmunitionCommand = new ShowAmmunitionCommand(knight);
                    showAmmunitionCommand.execute();
                    break;
                }
                case "6": {
                    menuFlag = false;
                    break;
                }
                default:
                    System.out.println("Немає такого пункту\n");
            }
        }

    }
}
