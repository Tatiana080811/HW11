import java.time.LocalDate;

public class AppInstaller {

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
