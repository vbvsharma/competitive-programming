import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 3;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++)
            a.add(input.nextInt());

        for (int i = 0; i < n; i++)
            b.add(input.nextInt());

        input.close();
        
        compareTriplets(a, b);
    }

    private static void compareTriplets(List<Integer> a, List<Integer> b) {
        int pointA = 0, pointB = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))        pointA++;
            else if (a.get(i) < b.get(i))   pointB++;
        }

        System.out.println(pointA + " " + pointB);
    }
}
