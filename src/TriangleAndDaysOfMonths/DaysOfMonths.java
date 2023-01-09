package TriangleAndDaysOfMonths;
import java.util.Scanner;

public class DaysOfMonths {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println( "Put a month's number from 1 to 12.");
        // 1-January,2-February,3-March,4-April,5-May,6-June,7-July,8-August,9-September,10-October,11-November,12-December
        int Month ;
        Month  = scanner.nextInt() ;
        System.out.println("The number for the month is " + Month ) ;
        switch (Month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("This month has 31 days") ;
                break;
            case 4, 6, 9, 11:
                System.out.println("This month has 30 days") ;
                break;
            case 2:
                System.out.println("This month has 28 days") ;
                break;
            default:
                System.out.println("This number does not match for any month") ;
        }
    }
}

