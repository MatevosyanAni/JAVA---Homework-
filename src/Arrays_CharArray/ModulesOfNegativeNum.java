package Arrays_CharArray;

public class ModulesOfNegativeNum {
    public static void main(String[] args) {
        int[] array4 = {-7, 1, -6, 8, 5, -9, 3};
        int[] array5 = new int[array4.length];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < 0) {
                array5[i] = array4[i] * (-1);
                counter1++;
            }
            if (array4[i] > 0) {
                array5[i] = array4[i];
                counter2++;
            }
            System.out.print(array5[i] + " , ");
        }
        System.out.println();
        System.out.println("The counter  of replacing numbers: " + counter1);
        System.out.println("The counter of positive numbers: " + counter2);
    }
}
