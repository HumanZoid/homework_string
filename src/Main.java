import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            task1(scanner);
            task2(scanner);
        }
    }

    public static void task1(Scanner scanner) {
        System.out.println(" Введите фамилию : ");
        String lastName = scanner.next();
        System.out.println(" Введите отчество : ");
        String middleName  = String.valueOf(scanner.next());
        System.out.println(" Введите имя : ");
        String firstName  = String.valueOf(scanner.next());
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }

    public static void task2(Scanner scanner) {

    }

}