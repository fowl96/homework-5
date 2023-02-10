public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();



    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Наше приложение не поддерживается на операционной системе вашего телефона");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Наше приложение не поддерживается на операционной системе вашего телефона");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        short year = 2021;
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte deliveryDistance = 95;
        byte deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: " + (deliveryTime+1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime+2));
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        short monthNumber = 12;
        if (monthNumber < 13) {
            switch (monthNumber) {
                case (1):
                    System.out.println("Зима");
                    break;
                case (2):
                    System.out.println("Зима");
                    break;
                case (3):
                    System.out.println("весна");
                    break;
                case (4):
                    System.out.println("весна");
                    break;
                case (5):
                    System.out.println("весна");
                    break;
                case (6):
                    System.out.println("лето");
                    break;
                case (7):
                    System.out.println("лето");
                    break;
                case (8):
                    System.out.println("лето");
                    break;
                case (9):
                    System.out.println("осень");
                    break;
                case (10):
                    System.out.println("осень");
                    break;
                case (11):
                    System.out.println("осень");
                    break;
                case (12):
                    System.out.println("зима");
                    break;
            }
        }

    }
}