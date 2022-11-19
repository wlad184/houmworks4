public class Main {
    public static void main(String[] args) {
        //task #1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //task #2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
           }else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        }
        if (clientOS ==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
           }else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
        System.out.println();

        //task #3
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
        System.out.println();

        //task #4
        int deliveryDistance = 550;
        if (deliveryDistance < 20) {
            System.out.println("Сутки");
        }else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Двое суток");
            } else {
            System.out.println(" трое суток");
        }




    }
}