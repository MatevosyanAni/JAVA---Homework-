package BinaryToDecimal;
public class BinaryToDecimalNumber {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 1, 1};
        int x = 1; // x= is the (0)exponent of 2
        int sumOfDecimals = 0;
        int decimal;
        for (int i = array1.length - 1; i >= 0; i--) {
            decimal = array1[i] * x;
            sumOfDecimals = sumOfDecimals + decimal;
            x = x * 2;
        }
        System.out.println(sumOfDecimals);
    }
}

