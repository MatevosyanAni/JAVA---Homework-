package TriangleAndDaysOfMonths;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(" a = " + a);
        int b = scanner.nextInt();
        System.out.println(" b = " + b);
        int c = scanner.nextInt();
        System.out.println("c = " + c);
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The formation of triangle is possible");
        } else {
            System.out.println("The formation of triangle is not possible");
        }
    }
}
