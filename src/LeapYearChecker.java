import java.time.LocalDate;

    public class LeapYearChecker {

        public static void main(String[] args) {
            checkLeapYear(2021);
        }

        public static void checkLeapYear(int year) {
            if (year <= 1584) {
                System.out.println("Год должен быть больше 1584.");
            } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " — год является високосным.");
            } else {
                System.out.println(year + " — год не является високосным.");
            }
        }

        public class CheckingSystemYearPhone {

            public static void main(String[] args) {
                checkSystemYear(0, 2004);
            }

            public static void checkSystemYear(int clientOS, int clientDeviceYear) {
                int currentYear = LocalDate.now().getYear();
                boolean isOldDevice = clientDeviceYear < currentYear;
                String platformName = (clientOS == 0) ? "iOS" : "Android";
                if (isOldDevice) {
                    System.out.println("Установите облегченную версию приложения для " + platformName + " по ссылке");
                } else {
                    System.out.println("Установите версию приложения для " + platformName + " по ссылке");
                }
            }

            public class CheckingDistanceDeterminindDeliveryTime {
                public static void main(String[] args) {
                    int deliveryDistance = 95;
                    int deliveryDays = calculateDeliveryDays(deliveryDistance);
                    if (deliveryDays >= 0) {
                        System.out.println("Потребуется дней: " + deliveryDays);
                    } else {
                        System.out.println("Доставка не осуществляется.");
                    }
                }
                private static int calculateDeliveryDays(int distance) {
                    if (distance <= 20) {
                        return 1;
                    } else if (distance <= 60) {
                        return 2;
                    } else if (distance <= 100) {
                        return 3;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
