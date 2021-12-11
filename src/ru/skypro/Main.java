package ru.skypro;

public class Main {

    public static void year (int a) {
        if (a % 4 == 0 || a % 400 == 0 || a % 100 == 0) {
            System.out.println(a + " год високосный.");
        } else {
            System.out.println(a + " год не високосный.");
        }
    }

    public static void getClientOS (int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int daysForDelivery (int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } if (deliveryDistance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void strings (String string) {
        char[] str1 = string.toCharArray();
        System.out.print("Дубликаты: ");
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (str1[i] == str1[j]) {
                    System.out.print(str1[j] + " ");
                    break;
                }
            }
        }
    }

    public static void array (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

        public static void main (String[]args){
        // задача 1
        int currentYear = 1402;
            year(currentYear);
        // задача 2
            int clientOS = 0;
            int clientDeviceYear = 2014;
            getClientOS(clientOS, clientDeviceYear);
        // задача 3
            int deliveryDistance = 50;
            int daysForDelivery = daysForDelivery(deliveryDistance);
            System.out.println("Потребуется дней: " + daysForDelivery);
        // задача 4
            String str = "aabccddefgghiijjkk";
            strings(str);
            System.out.println();
        //задача 5
            int[] arr = new int[]{3, 2, 1, 6, 5};
            array(arr);
        }
}