package ArraysLongestFirstAndSecondElement;

public class TheFirstAndTheSecondElements {
    public static void main(String[] args) {
        int[][] array1 = {
                {3, 5, 8, 4, 7},
                {5, 7, 9, 6},
                {6, 8, 9, 10},
        };
        for (int i = 0; i < array1.length; i++) {
            System.out.print("The first element is " + array1[i][0] + " " +  "The last one is " +  array1[i][array1[i].length - 1]);
            System.out.println();
        }
    }
}
