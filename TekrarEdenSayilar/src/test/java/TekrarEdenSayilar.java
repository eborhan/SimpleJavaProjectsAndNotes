import java.util.*;
public class TekrarEdenSayilar {
    static boolean isCheck(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 5, 6, 9, 8, 6, 4, 3, 4};
        int[] evenList = new int[list.length];
        int index = 0;


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++)
                if ((i != j) && (list[i] == list[j]) && (list[j] % 2 == 0)) {
                    if (!isCheck(evenList, list[i])) {
                        evenList[index++] = list[i];
                    }
                    break;
                }
        }
        for (int i : evenList) {
            if (i != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}