/*
 Write a program to sort the given array using quick sort.
*/

import java.util.Scanner;

public class quickSort {
    static void sort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    static void divide(int[] arr, int si, int ei) {
        if (si <= ei) {
            int pivotIndx = pivotIndex(arr, si, ei);

            divide(arr, si, pivotIndx - 1);
            divide(arr, pivotIndx + 1, ei);
        }
    }

    static int pivotIndex(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j <= ei - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        i++;
        swap(arr, i, ei);

        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
