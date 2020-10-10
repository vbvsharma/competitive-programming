import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            int[] dep = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                dep[i] = Integer.parseInt(st.nextToken());

            System.out.println(minPlatforms(arr, dep));
        }
        br.close();
    }

    private static int minPlatforms(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int iA = 0;
        int currPlatforms = 0, maxPlatforms = 0;
        for (int iD = 0; iD < dep.length; iD++) {
            while (iA < arr.length && arr[iA] <= dep[iD]) {
                currPlatforms++;
                iA++;
            }

            maxPlatforms = Math.max(maxPlatforms, currPlatforms);
            currPlatforms--;
        }

        return maxPlatforms;
    }
}