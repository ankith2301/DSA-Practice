package com.searchAlgorithm;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,6,8,9,12,16,19,24,28,29};
        //Binary Search
        System.out.println("Binary search : "+binarySearch(12, arr1));

        //OrderAgnosticBinarySearch
        System.out.println("OrderArgnostic search : "+orderAgnosticBinarySearch(1,arr1));
    }
    static String binarySearch(int key, int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (key < array[mid]){
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            }else
                return "Element "+key+" exist at "+(mid+1)+ " position";
        }
        return "Element not found!!";
    }

    static String orderAgnosticBinarySearch(int key, int[] array){
        int start = 0;
        int end = array.length - 1;

        // Find whether array is sorted in asc or desc
        boolean isAsc = array[start] < array[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (array[mid] == key)
                return "Element found at "+(mid+1)+" position";

            if (isAsc){
                if (key < array[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }else {
                if (key > array[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return "Element not found!!";
    }
}
