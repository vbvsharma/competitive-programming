import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lb = input.nextInt();
        int bh = input.nextInt();
        int hl = input.nextInt();
        input.close();

        int l = (int) Math.sqrt(lb * hl / bh);
        int b = (int) Math.sqrt(bh * lb / hl);
        int h = (int) Math.sqrt(hl * bh / lb);

        System.out.println(4 * (l + b + h));
    }
}