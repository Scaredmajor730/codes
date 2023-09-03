public class insertionSorter {
    public static void main(String args[]){
        int[] arr = {22,34,36,78,44,23,67,99};
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j+1])
            {
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
