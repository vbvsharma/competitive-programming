import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder revA = new StringBuilder(A);
        sc.close();
        
        if (A.compareTo(revA.reverse().toString()) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}