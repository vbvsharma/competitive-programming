import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int minInd = 0, maxInd = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] <= arr[minInd])
                minInd = i;
            if (arr[maxInd] < arr[i])
                maxInd = i;
        }

        input.close();

        if (maxInd < minInd) {
            System.out.println(maxInd + arr.length - 1 - minInd);
        } else {
            System.out.println(maxInd + arr.length - minInd - 2);
        }
    }
}