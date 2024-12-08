/*
 Write a program to sort the given array using count sort.
*/

public class countSort {
    static void sort(int[] arr) {
        int max = getMax(arr);

        int[] count = new int[max + 1];
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[--count[arr[i]]] = arr[i];
        }

        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }

    static int getMax(int[] arr) {
        int max = 0;
        for (int ele : arr) {
            max = Math.max(max, ele);
        }
        return max;
    }

    static void print(int[] arr) {
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

        int[] arr = {6, 3, 4, 5, 2, 1, 0};

        sort(arr);
        print(arr);
    }
}
