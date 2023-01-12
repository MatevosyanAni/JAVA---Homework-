package Arrays_CharArray;
public class ThirdArrayIsFullOfFirstSecondArrays {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 8, 7, 9, 3};
        int[] array2 = {9, 4, 3, 4, 5, 2};
        int[] array3 = new int[array1.length];
        for (int i = 0, k = 0, j = 0; i < array1.length; i++, k++) {
            if (array1[i] % 2 == 1 && array2[k] % 2 == 1){
                array3[j] = array1[i];
            } else if (array1[i] % 2 == 0 && array2[k] % 2 == 0) {
                array3[j] = array2[k];
            } else
                array3[j] = 0;
            System.out.print(array3[j] + " ");
        }
    }
}
