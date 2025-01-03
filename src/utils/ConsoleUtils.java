package utils;
import java.util.Scanner;

public class ConsoleUtils {

        private final Scanner scanner = new Scanner(System.in);

    public Integer getInteger(String message) {
        while (true) {
            try {
                System.out.println(message);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Ingresa un número con formato válido.");
                scanner.nextLine();
            }
        }
    }


}
