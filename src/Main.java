public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println(" Установите версию приложения для iOS по ссылке ");
                break;
            case 1:
                System.out.println(" Установите версию приложения для Android по ссылке ");
                break;
            default:
                System.out.println(" Данное приложение в разработке ");
        }

        int clientOS1 = 0;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данное приложение в разработке");
        }

        int year = 2021;
        if (year <= 1584) {
            System.out.println(" Год должен быть больше 1584 ");
        } else {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " год является високосным ");}
            else {
                System.out.println(year + " год не является високосным");
            }
        }

        int deliveryDistance = 45;
        int deliverytime = 0;
        if (deliveryDistance <= 20) {
            deliverytime = 1;
        } else if (deliveryDistance <= 60) {
            deliverytime = 2;
        } else if (deliveryDistance <= 100) {
            deliverytime = 3;
        } else {
            System.out.println(" Свыше 100км доставки нет ");
        }
        System.out.println(" Потребуется дней " + deliverytime);


        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
                System.out.println(" Месяц январь принаддлежит к зиме ");
                break;
            case 2:
                System.out.println(" Месяц февраль принаддлежит к зиме ");
                break;
            case 3:
                System.out.println(" Месяц март принадлежит к весне ");
                break;
            case 4:
                System.out.println(" Месяц апрель принадлежит к весне ");
                break;
            case 5:
                System.out.println(" Месяц май принадлежит к весне ");
                break;
            case 6:
                System.out.println(" Месяц июнь принадлежит к лету ");
                break;
            case 7:
                System.out.println(" Месяц июль принадлежит к лету ");
                break;
            case 8:
                System.out.println(" Месяц август принадлежит к лету ");
                break;
            case 9:
                System.out.println(" Месяц сентябрь принадлежит к осени ");
                break;
            case 10:
                System.out.println(" Месяц октябрь принадлежит к осени ");
                break;
            case 11:
                System.out.println(" Месяц ноябрь принадлежит к осень ");
                break;
            case 12:
                System.out.println(" Месяц декабрь принадлежит к зиме ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
        }
    }
}
