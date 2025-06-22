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


            class appInstaller {

                public static void main(String[] args) {
                    installApp(0, 2024);
                }

                public static void installApp(int clientOS, int clientDeviceYear) {
                    int currentYear = LocalDate.now().getYear();
                    boolean isOldDevice = clientDeviceYear < currentYear;
                    String platformName = (clientOS == 0) ? "iOS" : "Android";
                    if (isOldDevice) {
                        System.out.println("Установите облегченную версию приложения для " + platformName + " по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для " + platformName + " по ссылке");
                    }
                }
            }

            public class CardDelivery {

                public static int calculateDeliveryDays(int deliveryDistance) {
                    if (deliveryDistance <= 20) {
                        return 1;
                    } else if (deliveryDistance <= 60) {
                        return 2;
                    } else if (deliveryDistance <= 100) {
                        return 3;
                    } else {
                        throw new IllegalArgumentException("Доставка не предусмотрена для расстояний свыше 100 км.");
                    }
                }

                public static void main(String[] args) {
                    int deliveryDistance = 95;
                    try {
                        int deliveryDays = calculateDeliveryDays(deliveryDistance);
                        System.out.println("Потребуется дней: " + deliveryDays);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }







