import java.util.*;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int row = scan.nextInt();
        System.out.print("Enter the column number: ");
        int column = scan.nextInt();


        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter a number for row " + (i + 1) + " and column " + (j + 1) + ": ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix given: ");
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix given: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
