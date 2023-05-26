package Homework.Lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class allLaptops {
        public static void main(String[] args) {
                PrintList(LaptopSelection(Interface(MapMethod())));
        }

        /**
         * @param - resultFilters
         * @return - Метод заполняет Map значениями по умолчанию и возвращает его.
         */
        public static Map<Integer, String> MapMethod() {
                Map<Integer, String> resultFilters = new HashMap<>();
                resultFilters.put(1, "Acer Dell MSI Asus Apple");
                resultFilters.put(2, "0");
                resultFilters.put(3, "серебристый белый черный");
                resultFilters.put(4, "0");
                resultFilters.put(5, "0");
                resultFilters.put(6, "0");
                resultFilters.put(7, "Windows_10 Windows_11 Linux macOS без_ОС");
                return resultFilters;
        }

        /**
         * @param resultFilters
         * @return - Метод возвращает Map с заданными фильтрами пользователя.
         */
        public static Map<Integer, String> Interface(Map<Integer, String> resultFilters) {

                System.out.println("Введите цифру, соответствующую необходимому критерию, для настройки фильтра:\n" +
                                "1 - производитель\n" +
                                "2 - цена\n" +
                                "3 - цвет\n" +
                                "4 - диагональ экрана\n" +
                                "5 - RAM(ОЗУ)\n" +
                                "6 - объем жесткого диска\n" +
                                "7 - операционная система\n" +
                                "\n" +
                                "0 - показать результат\n");
                System.out.println("-->");

                boolean flag0 = true;
                while (flag0) {
                        try {
                                Scanner sc = new Scanner(System.in);
                                int filterDigit = sc.nextInt();

                                while (filterDigit != 0) {

                                        switch (filterDigit) {
                                                case 1:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите цифру, соответствующую необходимому производителю:\n"
                                                                                        +
                                                                                        "1 - Acer\n" +
                                                                                        "2 - Dell\n" +
                                                                                        "3 - MSI\n" +
                                                                                        "4 - Asus\n" +
                                                                                        "5 - Apple\n" +
                                                                                        "6 - Все производители");
                                                        System.out.println("-->");

                                                        int filterBrand = sc.nextInt();
                                                        switch (filterBrand) {
                                                                case 1:
                                                                        resultFilters.put(1, "Acer");
                                                                        break;
                                                                case 2:
                                                                        resultFilters.put(1, "Dell");
                                                                        break;
                                                                case 3:
                                                                        resultFilters.put(1, "MSI");
                                                                        break;
                                                                case 4:
                                                                        resultFilters.put(1, "Asus");
                                                                        break;
                                                                case 5:
                                                                        resultFilters.put(1, "Apple");
                                                                        break;
                                                                case 6:
                                                                        break;
                                                                default:
                                                                        break;
                                                        }
                                                        break;

                                                case 2:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("Введите минимальную стоимость ноутбука: ");
                                                        System.out.println("-->");
                                                        Scanner sc1 = new Scanner(System.in);
                                                        double filterPrice = sc1.nextInt();
                                                        String str0 = Double.toString(filterPrice);
                                                        resultFilters.put(2, str0);
                                                        break;

                                                case 3:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите цифру, соответствующую необходимому цвету:\n"
                                                                                        +
                                                                                        "1 - серебристый\n" +
                                                                                        "2 - белый\n" +
                                                                                        "3 - черный\n" +
                                                                                        "4 - Все цвета");
                                                        System.out.println("-->");
                                                        int filterColor = sc.nextInt();

                                                        switch (filterColor) {
                                                                case 1:
                                                                        resultFilters.put(3, "серебристый");
                                                                        break;
                                                                case 2:
                                                                        resultFilters.put(3, "белый");
                                                                        break;
                                                                case 3:
                                                                        resultFilters.put(3, "черный");
                                                                        break;
                                                                case 4:
                                                                        break;
                                                                default:
                                                                        break;
                                                        }
                                                        break;

                                                case 4:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите минимальную диагональ экрана ноутбука: ");
                                                        System.out.println("-->");
                                                        Scanner sc2 = new Scanner(System.in);
                                                        double filterScreenDiagonal = sc2.nextInt();
                                                        String str = Double.toString(filterScreenDiagonal);
                                                        resultFilters.put(4, str);
                                                        break;

                                                case 5:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите минимальный объем оперативной памяти (Гб): ");
                                                        System.out.println("-->");
                                                        Scanner sc3 = new Scanner(System.in);
                                                        Integer filterRAM = sc3.nextInt();
                                                        String str1 = Integer.toString(filterRAM);
                                                        resultFilters.put(5, str1);
                                                        break;

                                                case 6:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите минимальный объем жесткого диска: ");
                                                        System.out.println("-->");
                                                        Scanner sc4 = new Scanner(System.in);
                                                        Integer filterHDCapacity = sc4.nextInt();
                                                        String str2 = Integer.toString(filterHDCapacity);
                                                        resultFilters.put(6, str2);
                                                        break;

                                                case 7:
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println(
                                                                        "Введите цифру, соответствующую необходимой оперативной памяти ноутбука:\n"
                                                                                        +
                                                                                        "1 - Windows 10\n" +
                                                                                        "2 - Windows 11\n" +
                                                                                        "3 - Linux\n" +
                                                                                        "4 - macOS\n" +
                                                                                        "5 - без ОС\n" +
                                                                                        "6 - Все варианты");
                                                        System.out.println("-->");
                                                        int filterOS = sc.nextInt();

                                                        switch (filterOS) {
                                                                case 1:
                                                                        resultFilters.put(7, "Windows_10");
                                                                        break;
                                                                case 2:
                                                                        resultFilters.put(7, "Windows_11");
                                                                        break;
                                                                case 3:
                                                                        resultFilters.put(7, "Linux");
                                                                        break;
                                                                case 4:
                                                                        resultFilters.put(7, "macOS");
                                                                        break;
                                                                case 5:
                                                                        resultFilters.put(7, "без_ОС");
                                                                        break;
                                                                case 6:
                                                                        break;
                                                        }
                                                        break;
                                        }
                                        System.out.print("\033[H\033[2J");
                                        System.out.println(
                                                        "Введите цифру, соответствующую необходимому критерию, для настройки фильтра:\n"
                                                                        +
                                                                        "1 - производитель\n" +
                                                                        "2 - цена\n" +
                                                                        "3 - цвет\n" +
                                                                        "4 - диагональ экрана\n" +
                                                                        "5 - RAM(ОЗУ)\n" +
                                                                        "6 - объем жесткого диска\n" +
                                                                        "7 - операционная система\n" +
                                                                        "\n" +
                                                                        "0 - показать результат\n");
                                        filterDigit = sc.nextInt();
                                }
                                System.out.print("\033[H\033[2J");
                                System.out.println(
                                                "Введите цифру, соответствующую необходимому критерию, для настройки фильтра:\n"
                                                                +
                                                                "1 - производитель\n" +
                                                                "2 - цена\n" +
                                                                "3 - цвет\n" +
                                                                "4 - диагональ экрана\n" +
                                                                "5 - RAM(ОЗУ)\n" +
                                                                "6 - объем жесткого диска\n" +
                                                                "7 - операционная система\n" +
                                                                "\n" +
                                                                "0 - показать результат\n");
                                flag0 = false;
                        } catch (java.util.InputMismatchException e) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("Ошибка. Необходимо ввести число:");
                                System.out.println("-->");
                                System.out.println();
                                System.out.println(
                                                "Введите цифру, соответствующую необходимому критерию, для настройки фильтра:\n"
                                                                +
                                                                "1 - производитель\n" +
                                                                "2 - цена\n" +
                                                                "3 - цвет\n" +
                                                                "4 - диагональ экрана\n" +
                                                                "5 - RAM(ОЗУ)\n" +
                                                                "6 - объем жесткого диска\n" +
                                                                "7 - операционная система\n" +
                                                                "\n" +
                                                                "0 - показать результат\n");
                        }
                }
                return resultFilters;
        }

        /**
         * @param resultLaptop
         * @return - Метод сортирует и возвращает список ноутбуков в соответствии с
         *         приходящими в Map заданными параметрами.
         */
        public static List<String> LaptopSelection(Map<Integer, String> resultFilters) {

                List<Laptops> laptop = GetAllLaptops();
                List<String> resultLaptop = new ArrayList<>();

                for (int i = 1; i <= resultFilters.size(); i++) {
                        resultLaptop.add(resultFilters.get(i));
                }

                for (Laptops Laptops : laptop) {
                        String[] strBrand = Laptops.brand.split(" ");
                        for (int i = 0; i < strBrand.length; i++) {
                                String[] strBrandFilters = resultFilters.get(1).split(" ");
                                for (int j = 0; j < strBrandFilters.length; j++) {
                                        if (strBrand[i].equals(strBrandFilters[j])) {
                                                if (Laptops.price >= Double.parseDouble(resultFilters.get(2).trim())) {
                                                        String[] strColor = resultFilters.get(3).split(" ");
                                                        for (int k = 0; k < strColor.length; k++) {
                                                                if (strColor[k].equals(Laptops.color)) {
                                                                        if (Laptops.screen_Diagonal >= Double
                                                                                        .parseDouble(resultFilters
                                                                                                        .get(4)
                                                                                                        .trim())) {
                                                                                if (Laptops.ram >= Integer.parseInt(
                                                                                                resultFilters.get(5)
                                                                                                                .trim())) {
                                                                                        if (Laptops.hd_capacity >= Integer
                                                                                                        .parseInt(resultFilters
                                                                                                                        .get(6)
                                                                                                                        .trim())) {
                                                                                                String[] strOS = resultFilters
                                                                                                                .get(7)
                                                                                                                .split(" ");
                                                                                                for (int l = 0; l < strOS.length; l++) {
                                                                                                        if (strOS[l].equals(
                                                                                                                        Laptops.os)) {
                                                                                                                resultLaptop.add(
                                                                                                                                Laptops.brand);
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
                return resultLaptop;
        }

        /**
         * @return - Метод печатает на экран конечный список ноутбуков.
         */
        public static void PrintList(List<String> resultLaptop) {
                System.out.print("\033[H\033[2J");

                System.out.println("Заданные параметры:\n" +
                                "Производитель - " + resultLaptop.get(0) + "\n" +
                                "Стоимость от - " + resultLaptop.get(1) + " рублей" + "\n" +
                                "Цвет - " + resultLaptop.get(2) + "\n" +
                                "Диагональ экрана от - " + resultLaptop.get(3) + " дюймов" + "\n" +
                                "RAM(ОЗУ) от - " + resultLaptop.get(4) + " Гб" + "\n" +
                                "Объем жесткого диска от - " + resultLaptop.get(5) + " Гб" + "\n" +
                                "Операционная система - " + resultLaptop.get(6));
                System.out.println();

                for (int j = 0; j < 7; j++) {
                        resultLaptop.remove(0);
                }

                System.out.println("Список ноутбуков с заданными параметрами:");
                int num = 1;
                for (String str : resultLaptop) {
                        System.out.println(num + ". " + str);
                        num += 1;
                }

        }

        /**
         * @return - Метод содержит список всех ноутбуков.
         */
        public static List<Laptops> GetAllLaptops() {

                List<Laptops> allLaptops = new ArrayList<Laptops>();

                // Acer:
                allLaptops.add(new Laptops("Acer Aspire 3 A314-35-C5A4", 27_999, "серебристый", 15.6, 8, 128,
                                "Windows_11",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Acer Extensa 15 EX215-54", 56_999, "белый", 17.3, 8, 128, "Windows_11",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Acer Aspire 7 A715-42G-R8K0", 77_299, "черный", 15.6, 16, 512, "без_ОС",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(new Laptops("Acer  Nitro 5 AN515-45-R671", 129_999, "черный", 17.3, 16, 1000,
                                "Windows_11",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

                // Dell:
                allLaptops.add(
                                new Laptops("Dell Vostro 3515", 36_299, "серебристый", 15.6, 4, 128, "Linux",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Dell Vostro 3500-5698", 42_999, "белый", 15.6, 8, 256, "Windows_10",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Dell G15 G15RE", 74_999, "черный", 15.6, 8, 512, "без_ОС",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(new Laptops("Dell Latitude 5420", 156_000, "черный", 17.3, 16, 1000, "Windows_11",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

                // MSI:
                allLaptops.add(
                                new Laptops("MSI Modern 14 C12M-233X", 32_999, "серебристый", 14, 8, 256, "без_ОС",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(new Laptops("MSI Bravo 15 B5DD-415", 87_799, "белый", 15.6, 16, 512, "Linux",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(new Laptops("MSI Katana 17 B13VGK-471", 179_999, "черный", 17.3, 16, 1000, "Windows_11",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("MSI Raider GE78 HX 13VI-095", 386_999, "черный", 17, 32, 2000,
                                                "Windows_11",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

                // Asus:
                allLaptops.add(new Laptops("Asus Laptop 15 D543MA-DM1368", 19_999, "серебристый", 15.6, 4, 1000,
                                "без_ОС",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Asus VivoBook 15X OLED M1503QA-L1223", 58_999, "белый", 15.6, 8, 256,
                                                "Windows_10",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Asus TUF Gaming A17 FA706QM-HX029W", 134_999, "черный", 17.3, 16, 1000,
                                                "Linux",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(new Laptops("Asus ROG Strix G17 G713PI-LL044", 209_900, "черный", 17.3, 32, 256,
                                "Windows_11",
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

                // Apple:
                allLaptops.add(
                                new Laptops("Apple MacBook Air [NDM3]", 88_899, "серебристый", 13.3, 8, 256, "macOS",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops
                                .add(new Laptops("Apple MacBook Air [MGN3150]", 112_499, "белый", 13.3, 8, 512, "macOS",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Apple MacBook Pro [Z15G000CM]", 201_999, "черный", 16.2, 16, 512, "macOS",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
                allLaptops.add(
                                new Laptops("Apple MacBook Pro [MK1H3]", 293_999, "черный", 16.2, 32, 1000, "macOS",
                                                Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

                return allLaptops;
        }
}