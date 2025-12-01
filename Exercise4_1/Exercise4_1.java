import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, String month, int date, int year) {

    System.out.println("Amerikan Formatı: " + day + ", " + month + " " + date + ", " + year);

    }

    public static void printEuropean(int date, String month, int year, String day) {

        System.out.println("Avrupa Formatı: " + date + " " + month + " " + year + ", " + day);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Day: ");
        String day = input.next();
        System.out.print("Month: ");
        String month = input.next();
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Date: ");
        int date = input.nextInt();

        printAmerican(day, month, date, year);
        printEuropean(date, month, year, day);

    }
}

