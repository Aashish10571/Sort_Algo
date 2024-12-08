/*
 Write a program to sort the given array using radix sort.
*/

public class radixSort {
    static void sort(int[] arr) {
        int max = getMax(arr);

        for (int div = 1; max / div > 0; div *= 10)
            countSort(arr, div);
    }

    static void countSort(int[] arr, int div) {
        int[] count = new int[10];
        int[] newArr = new int[arr.length];

        int i;

        for (i = 0; i < arr.length; i++)
            count[(arr[i] / div) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = arr.length - 1; i >= 0; i--)
            newArr[--count[(arr[i] / div) % 10]] = arr[i];

        System.arraycopy(newArr, 0, arr, 0, newArr.length);
    }

    static int getMax(int[] arr) {
        int max = 0;

        for (int ele : arr)
            max = Math.max(max, ele);

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

        int[] arr = {5, 1, 2, 0, 3, 4, 123, 453, 600, 7, 800, 0};

        sort(arr);
        print(arr);
    }
}
