import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] week = new int[7];
        int totalPagesReadInAWeek = 0;

        for (int i = 0; i < 7; i++) {
            week[i] = input.nextInt();
            totalPagesReadInAWeek += week[i];
        }

        input.close();
        
        int pagestoReadInLastWeek = n % totalPagesReadInAWeek == 0 ? 
                                    totalPagesReadInAWeek : (n % totalPagesReadInAWeek);
        
        int ans = 1;
        while (ans <= 7) {
            pagestoReadInLastWeek = pagestoReadInLastWeek - week[ans - 1];
            
            if (pagestoReadInLastWeek <= 0)
                break;
            
            ans++;
        }

        System.out.println(ans);
    }
}