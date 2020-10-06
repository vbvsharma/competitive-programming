import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();

            int sum_ids = 0, sum_sids = 0;
            while (N-- > 0) {
                sum_ids += input.nextInt();
                sum_sids += input.nextInt();
            }

            System.out.println(sum_ids - sum_sids);
        }
        input.close();
    }
}