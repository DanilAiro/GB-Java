package HW6;

import java.util.Map;
import java.util.Scanner;

public class Server {

    public static void showAll(Map<Integer, Laptop> laptopMap) {
        for (Laptop lt : laptopMap.values()) {
            System.out.println((lt.getId() + 1) + " " + lt);
        }
        System.out.println();
    }

    public static void filter() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Компания\n2 - Процессор\n3 - Видеокарта\n4 - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        switch (num) {
            case 1:
                System.out.println();
                Filter.showAll(laptopMap);
                break;

            case 2:
                System.out.println();
                System.out.print();
                num = sc.nextInt();
                sc.nextLine();
                break;

            case 0:
                System.out.println();
                isActive = false;
                break;

            default:
                System.out.println();
                System.out.println("Задача не распознана, повторите!");
                break;
        }

    }

}
