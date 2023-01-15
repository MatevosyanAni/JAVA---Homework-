package ArraysLongestFirstAndSecondElement;

public class Result {
    public static void main(String[] args) {
    int[] array3 = {1, 5, 3, 4, 8, 7, 6};
    int result = 0;
    for (int i = 1; i < array3.length; i++) {
        if (array3[i] > array3[i-1]) {
            result++;
        }
    }
    System.out.println("The result is " + result);
}
}
