/*
 Write a program to sort the given array using insertion sort.
*/

import java.util.Scanner;

public class insertionSort {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int indx = i - 1;
            while (indx >= 0 && arr[indx] > temp) {
                arr[indx + 1] = arr[indx];
                indx--;
            }
            arr[indx + 1] = temp;
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
