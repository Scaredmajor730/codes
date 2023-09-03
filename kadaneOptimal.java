import java.io.*;

public class kadaneOptimal {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i);
            arr[i] = Integer.parseInt(br.readLine());
        }

        int res = maxSubarraySumKadane(arr, n);
        System.out.print(res);

    }

    public static int maxSubarraySumKadane(int[] arr, int n) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
    }
}
