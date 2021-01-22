import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String, Integer> count = new HashMap<>();
        while (n-- > 0) {
            String s = input.next();
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        input.close();

        String ans = "";
        int ansCount = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (ansCount < entry.getValue()) {
                ansCount = entry.getValue();
                ans = entry.getKey();
            }
        }

        System.out.println(ans);
    }
}