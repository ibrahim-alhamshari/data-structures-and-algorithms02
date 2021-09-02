package codeChallenge28;

public class QuickSort {

    public void quickSort(int[] arr, int left, int right){
        if (left < right)
        {
            // Partition the array by setting the position of the pivot value
            int position = partition(arr, left, right);
            // Sort the left
            quickSort(arr, left, position - 1);
            // Sort the right
            quickSort(arr, position + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];
       printArray(arr , arr.length);
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low  = (left - 1);

        for(int j = left; j <= right - 1; j++)
        {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                low ++;
                swap(arr, low , j);
            }
        }
        swap(arr, low  + 1, right);
        return (low  + 1);
    }


    public void swap(int[]arr,int low,int j){
        int temp;
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
//        System.out.println(" arr[i]: "+ arr[i]);
//        System.out.println(" arr[k]: "+ arr[k]);

    }

    public static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
