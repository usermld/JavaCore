package com.example.JavaCore_2;

import java.util.Arrays;

public class DiffMinMax {
    public static int diff(int[]arr) {
        Arrays.stream(arr).sorted();
        return arr[arr.length -1] - arr[0];
    }
}