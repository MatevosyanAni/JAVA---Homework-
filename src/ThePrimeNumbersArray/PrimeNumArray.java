package ThePrimeNumbersArray;

public class PrimeNumArray {
    public static void main(String[] args) {
        int[] array1 = {5, 8, 9, 6, 11};
        boolean PrimeIsFound = false;
        for (int i = 0; i < array1.length; i++) {
            boolean PrimeNum = true;
            for (int j = 2; j < array1[i] / 2; j++) {
                if (array1[i] % j == 0) {
                    PrimeNum = false;
                    break;
                }
            }
            if (PrimeNum && array1[i]>1) {
                System.out.print(array1[i] + " ");
            }
        }
        if (!PrimeIsFound){
            System.out.println("Prime Number is not found");
        }
            }
        }
