import java.util.*;

public class TekrarEdenSayilarFrekans {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 40, 40};
        int[] repetitiveNumbers = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            repetitiveNumbers[i] = 1;
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    repetitiveNumbers[i]++;
                    list[j] = 0;
                }
            }
            if (list[i] >= 1) {
                System.out.println("Number " + list[i] + " repeats " + repetitiveNumbers[i] + " times.");

            }

        }
    }
}

