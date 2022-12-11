import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        showLeapYearOrNot (2021);
        showAppVersion(1, LocalDate.now().getYear());
        showDeliveryDays(95,1);

    }

    public static void showLeapYearOrNot(int year) {
        System.out.println("Задача 1");
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("\n");
    }

    public static void showAppVersion (int clientOS, int  clientDeviceYear) {
        System.out.println("Задача 2");

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("\n");
    }

    public static void showDeliveryDays (int deliveryDistance, int deliveryDay) {
        System.out.println("Задача 3");

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("\n");
    }
}