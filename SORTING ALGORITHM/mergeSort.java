/*
 Write a program to sort the given array using merge sort.
*/

import java.util.Scanner;

public class mergeSort {
    static void sort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        mergeArray(arr, si, mid, ei);
    }

    static void mergeArray(int[] arr, int si, int mid, int ei) {
        int[] merge = new int[ei - si + 1];

        int i1 = si;

        int i2 = mid + 1;

        int i = 0;

        while (i1 <= mid && i2 <= ei) {
            if (arr[i1] < arr[i2])
                merge[i++] = arr[i1++];
            else
                merge[i++] = arr[i2++];
        }

        while (i1 <= mid) {
            merge[i++] = arr[i1++];
        }

        while (i2 <= ei) {
            merge[i++] = arr[i2++];
        }

        for (int j = si, k = 0; k < merge.length; k++, j++) {
            arr[j] = merge[k];
        }
    }

    static void print(int[] arr) {
        System.out.println();
        System.out.println("Sorted array");
        System.out.println();
        System.out.print("[ ");
        for (int ele : arr) {
            if (ele == arr[arr.length - 1])
                System.out.print(ele);
            else
                System.out.print(ele + ", ");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("Size of the array : ");
        int n = inp.nextInt();
        System.out.println();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        sort(arr);
        print(arr);
    }
}
