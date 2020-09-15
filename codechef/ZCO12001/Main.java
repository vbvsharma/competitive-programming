import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int max_nest_depth = 0;
        int max_nest_first_pos = 0;
        int max_symbols = 0;
        int max_start = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int ch = input.nextInt();
            if (ch == 1) {
                stack.add(i);
            } else {
                int ind = stack.pop();

                if (max_symbols < i - ind + 1) {
                    max_symbols = i - ind + 1;
                    max_start = ind;
                }
            }

            if (stack.size() > max_nest_depth) {
                max_nest_depth = stack.size();
                max_nest_first_pos = stack.peek();
            }
        }

        System.out.println(max_nest_depth + " " + (max_nest_first_pos+1) + " " +
                            max_symbols + " " + (max_start+1));

        input.close();
    }
}