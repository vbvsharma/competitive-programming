import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while (T-- > 0) {
			int N = input.nextInt();
			int[] A = new int[N];

			int put_0_at = 0;
			int put_2_at = N - 1;

			while (N-- > 0) {
				int x = input.nextInt();
				if (x == 0)
					A[put_0_at++] = 0;
				else if (x == 2)
					A[put_2_at--] = 2;
			}

			for (int i = put_0_at; i <= put_2_at; i++)
				A[i] = 1;

			print(A);
		}

		input.close();
	}

	private static void print(int[] A) {
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();
	}
}