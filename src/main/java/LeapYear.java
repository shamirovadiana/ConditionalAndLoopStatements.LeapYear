import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате \"yyyy\"");
        String leapYear = "Введённый год является високосным! Количество дней 366";
        String nonLeapYear = "Введённый год не является високосным! Количество дней 365";
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(leapYear);
        } else if (year % 100 == 0) {
            System.out.println(nonLeapYear);
        } else if (year % 4 == 0) {
            System.out.println(leapYear);
        } else {
            System.out.println(nonLeapYear);
        }
        
    }
}
