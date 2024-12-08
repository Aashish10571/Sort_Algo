/*
 Write a program to sort the given array using Dutch National flag.
*/

public class DNFSort {
    static void sort(int[] arr) {
        int si = 0;
        int mid = 0;
        int ei = arr.length - 1;

        while (mid <= ei) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, si, mid);
                    si++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, ei);
                    ei--;
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] arr = {1, 2, 0, 1, 0, 1, 0, 2, 0, 2, 1};

        sort(arr);

        System.out.print("[ ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("]");
    }
}
