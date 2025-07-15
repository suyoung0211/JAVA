package day05;

import java.util.Arrays;

public class B22SortAlgorithm {
    public static void main(String[] args) {
        int[] nums = { 31, 30, 37, 40, 1, 25 };
        System.out.println("기존 nums 배열 : " + Arrays.toString(nums));

        // for문을 활용한 sort 정렬
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[j]; // 변수값 교환을 위한 임시 변수
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println("i = " + i + "\t" + Arrays.toString(nums));
        }

        // selection Sort 메소드
        int[] nums2 = { 46, 25, 63, 4, 1, 14, 78, 35, 38 };
        System.out.println("기존 nums2 배열 : " + Arrays.toString(nums2));
        selectionSort(nums2);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j]; // 변수값 교환을 위한 임시 변수
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println("i = " + i + "\t" + Arrays.toString(arr));
        }
    }

}
