/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge27;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        int[] arr = {8, 4, 23, 42, 16, 15};
        System.out.println("initialArray");
        MergSort.printArray(arr);

       arr= MergSort.mergeSort(arr);

        System.out.println("sortedArray");
        MergSort.printArray(arr);
    }

//    public static void mergeSort(int[] arr) {
//
//        int n = arr.length;
//
//        if (n > 1) {
//            int mid = n / 2;
//            int[] left = Arrays.copyOfRange(arr, 0, mid);
//            int[] right = Arrays.copyOfRange(arr, mid, n);
//
//            mergeSort(left);
//            mergeSort(right);
//            merge(left, right, arr);
//        }
//
////        System.out.println(arr[0]);
//    }
//
//    public static void merge(int[] left, int[] right, int[] arr) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j]) {
//                arr[k] = left[i];
//                i = i + 1;
//            } else {
//                arr[k] = right[j];
//                j = j + 1;
//            }
//            k = k + 1;
//        }
//
//        if (i == left.length) {
//            right[j] = arr[k++];
//        } else {
//            left[i++] = arr[k++];
//        }



//
//    public static void printArray(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }
}