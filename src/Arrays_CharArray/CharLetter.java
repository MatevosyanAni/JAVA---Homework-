package Arrays_CharArray;
import java.util.Scanner;
public class CharLetter {
    public static void main(String[] args) {
        char[] array6 = {'k', 'n','o', 'w', 'l', 'e', 'd', 'g' ,'e', 'y'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("The chosen letter is ");
        int i = 0;
        char k = scanner.next().charAt(0);
        while (i < array6.length - 1) {
            if (array6[i] == k) {
                System.out.println("The letter is in the " + i + " index ");
                break;
            }
            i++;
        }
        if (array6[i] != k) {
                System.out.println("The letter is not found ");

            }
        }
    }
