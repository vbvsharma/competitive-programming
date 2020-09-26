import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B, H;
static boolean flag;
static {
    flag = true;
    Scanner input = new Scanner(System.in);
    try {
        B = input.nextInt();
        H = input.nextInt();
        input.close();
        if (B <= 0 || H <= 0)
            throw new Exception("Breadth and height must be positive");
    } catch (Exception ex) {
        System.out.println(ex);
        System.exit(0);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class