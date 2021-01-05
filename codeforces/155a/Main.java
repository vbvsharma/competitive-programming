import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++)
            scores[i] = input.nextInt();
        input.close();

        System.out.println(countRecords(scores));
    }

    private static int countRecords(int[] scores) {
        int count = 0;

        int minInd = 0, maxInd = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[minInd]) {
                count++;
                minInd = i;
            }

            if (scores[maxInd] < scores[i]) {
                count++;
                maxInd = i;
            }
        }

        return count;
    }
}