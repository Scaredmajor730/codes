import java.io.*;
import java.util.*;

class matrixTraversal {

    boolean traversalNaive(int target, int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    static boolean traversalOptimized(int target, int[][] matrix) {
        int low = 0;
        int high = (matrix.length * matrix[0].length) - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (matrix[mid / matrix[0].length][mid % matrix[0].length] == target)
                return true;
            if (matrix[mid / matrix[0].length][mid % matrix[0].length] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows and Columns");
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter element (" + i + "," + j + ")");
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter target element");
        int a = Integer.parseInt(br.readLine());
        boolean res = traversalOptimized(a, matrix);
        System.out.println(res);
    }
}
