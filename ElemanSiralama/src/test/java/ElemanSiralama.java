import java.util.*;

public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array's length: ");
        int i = scan.nextInt();

        int[] list = new int[i];
        System.out.println("Enter the array's items: ");

        for (i = 0; i < list.length; i++) {
            System.out.print("Enter " + (i + 1) + ". item: ");
            int j = scan.nextInt();
            list[i] = j;
        }
        Arrays.sort(list);
        System.out.println("The sorted array: " + Arrays.toString(list));

    }
}
