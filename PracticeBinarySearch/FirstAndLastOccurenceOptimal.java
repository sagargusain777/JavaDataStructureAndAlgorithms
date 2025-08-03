package PracticeBinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 9};
        int target = 3;
        int first = firstAndLastOccurence(arr, target, true);
        int last = firstAndLastOccurence(arr, target, false);
        int[] answer = {first, last};
        System.out.println(Arrays.toString(answer));


    }

    public static int firstAndLastOccurence(int[] arr, int target, boolean type) {

        int answer = -1;
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0 || target > arr[arr.length - 1]) {
            return answer;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                if (type) {
                    answer = mid;
                    end = mid - 1;
                } else {
                    answer = mid;
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}
