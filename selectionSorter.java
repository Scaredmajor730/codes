
public class selectionSorter {
    public static void main(String args[])
    {
        int[] arr = {10,44,77,67,4,22,6};

        for (int i = 0;i<arr.length-1;i++) {
            int minim = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minim])
                    minim = j;
            }
            int temp = arr[i];
            arr[i] = arr[minim];
            arr[minim] = temp;
        }

        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
