import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert year in format \"yyyy\"");
        int year = scan.nextInt();
        if (year%400==0 || (year%4==0 && year%100 != 0)){
            System.out.println("Year is leap. Quantity of days in a year: 366");
        } else {
            System.out.println("Year is non-leap. Quantity of days in a year: 365");
        }
    }
}