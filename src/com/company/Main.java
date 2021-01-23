package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {5, 2, 1, 10, 50, 10};
        for (int N = 0; N < arr.length - 1; N++) {
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k + 1]) {
                int tmp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = tmp;
            }
            }
        }
System.out.println(Arrays.toString(arr));
}
}

