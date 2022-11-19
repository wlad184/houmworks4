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


    }
}