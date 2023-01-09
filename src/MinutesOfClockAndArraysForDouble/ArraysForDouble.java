package MinutesOfClockAndArraysForDouble;

public class ArraysForDouble {
    public static void main(String[] args) {
        double[] Arraya = {5.7, 6.4, -2.1, 8.9, -3.6};
        double[] Arrayb = new double[5];
        int m = 0;
        if (Arraya[0] > 0) {
            Arrayb[m] = Arraya[0];
            m++;
        }
        if (Arraya[1] > 0) {
            Arrayb[m] = Arraya[1];
            m++;
        }
        if (Arraya[2] > 0) {
            Arrayb[m] = Arraya[2];
            m++;
        }
        if (Arraya[3] > 0) {
            Arrayb[m] = Arraya[3];
            m++;
        }
        if (Arraya[4] > 0) {
            Arrayb[m] = Arraya[4];
        }
        System.out.println("[" + Arrayb[0] + ","+ Arrayb[1]+"," + Arrayb[2] + "," + Arrayb[3] + "," + Arrayb[4] + "]");
    }
}
