package ArraysLongestFirstAndSecondElement;

public class TheLongestArray {
    public static void main(String[] args) {
        int[][] array2 = {
                {1, 5, 8, 9},
                {2, 7, 10, 9, 8},
                {4, 9, 2, 3},
        };
        int[] max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].length > max.length) {
                max = array2[i];
            }
        }
        System.out.println("The longest array is ");
        for (int k= 0; k < max.length; k++) {
            System.out.println(max[k]);
        }
    }
}
