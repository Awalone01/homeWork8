package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void checkLeapYear (int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год високосный.");
        } else {
            System.out.println(a + " год не високосный.");
        }
    }

    public static void getClientOS (int clientOS, int clientDeviceYear) {
        boolean deviceIsOld = isDeviceOld(clientDeviceYear);
        if (deviceIsOld) {
            System.out.println("Установите облегченную версию приложения для " + (clientOS == 0 ? "IOS" : "Android"));
        } else {
            System.out.println("Установите версию приложения для " + (clientOS == 0 ? "IOS" : "Android"));
        }
    }

    public static boolean isDeviceOld(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear < currentYear;
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

    public static void getDuplicates (String string) {
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

    public static void reverseArray (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

        public static void main (String[]args){
        // задача 1
        int currentYear = 2000;
            checkLeapYear(currentYear);
        // задача2
            getClientOS(1, 2021); //Если я создаю отдельный метод по проверке ОС, то внутри этого метода я без проблем могу уведомить клиента,
            // что его ОС не подходит (при значении "5"). Но потом я сталкиваюсь с проблемой, что потом я не знаю как это сообщение вывести с проверкой clientDeviceYear.
            // Так как у меня потом получается примерно такое: "Установите версию приложения для Такой версии ещё не придумали".
        //задача 3
            int deliveryDistance = 50;
            int daysForDelivery = daysForDelivery(deliveryDistance);
            System.out.println("Потребуется дней: " + daysForDelivery);
        // задача 4
            String str = "aabccddefgghiijjkk";
            getDuplicates(str);
            System.out.println();
        //задача 5
            int[] arr = new int[]{3, 2, 1, 6, 5};
            reverseArray(arr);
        }
}