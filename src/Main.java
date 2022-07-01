import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            task1(scanner);
            task2(scanner);
            task3(scanner);
        }
    }

    public static void task1(Scanner scanner) {
        System.out.println(" Введите фамилию : ");
        String lastName = scanner.next();
        System.out.println(" Введите отчество : ");
        String middleName = scanner.next();
        System.out.println(" Введите имя : ");
        String firstName = String.valueOf(scanner.next());
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(" ФИО сотрудника - "+ fullName);
    }

    public static void task2(Scanner scanner) {
        System.out.println(" Введите фамилию : ");
        String lastName = scanner.next();
        System.out.println(" Введите отчество : ");
        String middleName = String.valueOf(scanner.next());
        System.out.println(" Введите имя : ");
        String firstName = String.valueOf(scanner.next());
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

    public static void task3(Scanner scanner) {
        System.out.println(" Введите фамилию : ");
        String lastName = scanner.next();
        System.out.println(" Введите отчество : ");
        String middleName = scanner.next();
        System.out.println(" Введите имя : ");
        String firstName = String.valueOf(scanner.next());
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО до замены ё " + fullName);
        System.out.println("ФИО после замены ё " + fullName.replace("ё","e"));
    }
}