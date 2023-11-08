import java.util.*;

public class YakinEnKucukEnBuyuk {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int min = list[0];
        int max = list[0];

        Arrays.sort(list);

        for (int i : list) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("The smallest number nearest the number entered: " + min);
        System.out.println("The greatest number nearest the number entered: " + max);
    }
}