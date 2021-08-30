package codeChallenge27;

public class MergSort {

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int midPoint = array.length / 2;
        System.out.println(midPoint);
        int[] left = new int[midPoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }

        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[midPoint + j];
        }

        int[] results;

        left = mergeSort(left);
        right = mergeSort(right);

        results = merge(left, right);
        return results;
    }

    public static int[] merge(int[] left, int[] right) {

        int[] results = new int[left.length + right.length];

        int leftPointer, rightPointer, resultsPointer;
        leftPointer = rightPointer = resultsPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {

            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    results[resultsPointer++] = left[leftPointer++];
//                    resultsPointer++;
//                    leftPointer++;
                } else {
                    results[resultsPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                results[resultsPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                results[resultsPointer++] = right[rightPointer++];
            }
        }
        return results;
    }
}
