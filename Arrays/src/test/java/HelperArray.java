public class HelperArray {

    static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;

        }
        return arr;
    }

    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }


        }
        return -1;
    }

    static int[] copy(int[] arr) {
        int[] copyList = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyList[i] = arr[i];
        }
        return copyList;
    }

    static int[] copy1(int[] arr) {
        int[] copyList1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyList1[i] = arr[i];
        }
        return copyList1;
    }
}

