import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsleapYear(2023);
        recommendOS(1, 2020);
        calculateDeliveryDays(50);
    }


    //task1
    public static void printIsleapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не является вискосным годом");
        }
    }

    //task2
    public static void recommendOS(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print(" Lite");
        }
        System.out.print(" версию для ");
        if (clientOS ==0) {
            System.out.println("iOS");
        }else {
            System.out.println("Android");
        }
    }
    private static boolean isDeviceOld(int deviceYear ){
        int currentYear = LocalDate.now().getYear();
        return deviceYear<= currentYear;
    }

    //task3
    public static void calculateDeliveryDays (int deliveryDistance){
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance <60 && deliveryDistance <=100) {
            result++;
        }else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Необходимо дней " + result);
    }
}