package array.company;

import java.util.Arrays;
import java.util.Scanner;

public class interpolation_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int val = sc.nextInt();
        Arrays.sort(arr);

        int low = 0, high = arr.length - 1, pos = -1;

        while (low <= high && val >= arr[low] && val <= arr[high]) {
            if (low == high) {
                if (arr[low] == val) {
                    pos = low;
                }
                break;
            }

            int mid = low + ((val - arr[low]) * (high - low) / (arr[high] - arr[low]));

            if (arr[mid] == val) {
                pos = mid;
                break;
            }

            if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            System.out.println("Element found at index: " + pos);
        } else {
            System.out.println("Element not found");
        }
    }
}
