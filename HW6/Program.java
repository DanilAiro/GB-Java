package HW6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Laptop lt0 = new Laptop(0, "ASUS", "VivoBook PRO 15", "AMD Ryzen 5", "GeForce RTX 3050", 16, 512);
        Laptop lt1 = new Laptop(1, "Apple", "MacBook Air", "Apple M1", "Apple M1 7-core", 8, 256);
        Laptop lt2 = new Laptop(2, "ASUS", "ROG Strix G15", "AMD Ryzen 9", "GeForce RTX 3070 Ti", 32, 1000);
        Laptop lt3 = new Laptop(3, "Acer", "Nitro 5", "Intel Core i5", "GeForce RTX 3050", 16, 512);
        Laptop lt4 = new Laptop(4, "Apple", "MacBook Pro", "Apple M2", "Apple M2 10-core", 8, 256);
        Laptop lt5 = new Laptop(5, "Lenovo", "IdeaPad 3", "Intel Pentium Silver N5030", "Intel UHD Graphics 605", 8, 256);

        Map<Integer, Laptop> laptopMap = new HashMap<>();
        laptopMap.put(lt0.getId(), lt0);
        laptopMap.put(lt1.getId(), lt1);
        laptopMap.put(lt2.getId(), lt2);
        laptopMap.put(lt3.getId(), lt3);
        laptopMap.put(lt4.getId(), lt4);
        laptopMap.put(lt5.getId(), lt5);

        boolean isActive = true;

        while (isActive) {
            System.out.println();
            System.out.print(
                    "Введите 1 для вывода всех ноутбуков\nВведите 2 для настройки фильтров\nВведите 3 для вывода ноутбуков подходящих по фильтру\nДля выхода введите 0: ");
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
}
