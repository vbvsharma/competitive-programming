import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int p = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();
        input.close();

        int toastsPerPerson = (k * l) / nl / n;
        toastsPerPerson = Math.min(c * d / n,  toastsPerPerson);
        toastsPerPerson = Math.min(p / np / n, toastsPerPerson);

        System.out.println(toastsPerPerson);
    }
}