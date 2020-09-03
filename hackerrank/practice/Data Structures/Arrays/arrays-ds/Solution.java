// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        
        for (int i = a.length-1; i >= 0; i--) {
            b[a.length-1-i] = a[i];
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        a = reverseArray(a);

        for (int x : a)
            System.out.print(x + " ");
    }
}
