package MinutesOfClockAndArraysForDouble;
import java.util.Scanner;
public class MinutesForClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 1 && x <= 12) {
            System.out.println("The minutes are = " + x * 5);
        } else {
            System.out.println("Invalid input");

        }
    }
}
