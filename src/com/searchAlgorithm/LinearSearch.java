package com.searchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {12,2354,54,3,134,235,4,5,245,24,525,34,3,4,245,23,5};

        // Linear search
        System.out.println("Linear Search : "+linearSearch(4, array));

        //Minimum number ina list
        System.out.println("Minimum in an Array : "+minimumInAnArray(array));

        int [][] array2d = {
                {21324,424,53},
                {234,5,436,7,2545,1,148,345,6,45},
                {234784,98,76,76,8,98,7,4,32,3436},
                {9677,4,5,23,3,43,912,188,18,88358645,91}
        };
        //Search in 2d Array
        System.out.println(searchIn2DArray(5, array2d));

        //Find count of numbers with even number of digits
        System.out.println("Number of even digits in array : "+findCountOfEvenNumberofDigitsInAnArray(array));

    }
    public static String linearSearch(int key, int[]array){
        for (int element : array)
            if (key == element)
                return "Element Found";
        return "Element not found";
    }
    public static int minimumInAnArray(int[] array){
        int ans = array[0];
        for (int i : array){
            if (i < ans)
                ans = i;
        }
        return ans;
    }
    public static String searchIn2DArray(int key, int[][] array){
        for (int[] i : array)
            for (int j : i)
                if (j == key)
                    return "Found";
        return "Not Found";
    }
    public static int findCountOfEvenNumberofDigitsInAnArray(int[] array){
        int c = 0;
        for (int i : array){
            int digitsOfNumber = 0;
            while (i!=0){
                i = i / 10;
                digitsOfNumber++;
            }
            if (digitsOfNumber % 2 == 0)
                c++;
        }
        return c;
    }
}
