public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void printYear(int years) {
        int yers = years;
        if (yers % 100 == 0 && yers % 400 != 0 || yers % 4 != 0) {
            System.out.println(yers + " год не является високосным");
        } else {
            System.out.println(yers + " год  является високосным");

        }
    }

    public static void installOS(int os, int year) {

        if (year < 2015) {
            if (os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (year >= 2015) {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылк");
            }
        }
    }

    public static void deliveryDay(int distance) {
        int day = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней:" + day + ".");
        } else if (distance >= 20 && distance <= 60) {
            day += 1;
            System.out.println("Потребуется дней:" + day + ".");
        } else if (distance >= 60 && distance <= 100) {
            day += 2;
            System.out.println("Потребуется дней:" + day + ".");
        } else if (distance > 100) {
            System.out.println(" доставки нет");

        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        printYear(1600);

    }

    public static void task2() {
        System.out.println("Задача 2");
        installOS(0, 2022);
    }

    public static void task3() {
        System.out.println("Задача 3");
        deliveryDay(95);
    }

}
