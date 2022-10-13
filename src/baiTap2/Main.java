package baiTap2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lenght = Integer.parseInt(scanner.nextLine());
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.printf("Enter Element %d: \n", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Sorted Array: ");
        for (Integer arrayInt : array) {
            System.out.print(arrayInt + " ");
        }
        System.out.println("\nEnter Element to search: ");
        int number = Integer.parseInt(scanner.nextLine());
        binarySearch(array, number);
        if (binarySearch(array, number) != -1) {
            System.out.printf("%d is at index %d", number, binarySearch(array, number));
        } else {
            System.out.printf("%d doesn't exit in array",number);
        }
    }

    public static int binarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (number < array[mid]) {
                high = mid - 1;
            } else if (number > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
