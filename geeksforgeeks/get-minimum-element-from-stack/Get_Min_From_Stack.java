
// { Driver Code Starts
import java.util.*;

class Get_Min_From_Stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int q = sc.nextInt();
            GfG g = new GfG();
            while (q > 0) {
                int qt = sc.nextInt();

                if (qt == 1) {
                    int att = sc.nextInt();
                    g.push(att);
                    // System.out.println(att);
                } else if (qt == 2) {
                    System.out.print(g.pop() + " ");
                } else if (qt == 3) {
                    System.out.print(g.getMin() + " ");
                }

                q--;
            }
            System.out.println();
            T--;
        }
        sc.close();
    }
}

// } Driver Code Ends

class GfG {
    int minEle = 1000;
    Stack<Integer> s = new Stack<>();

    /* returns min element from stack */
    int getMin() {
        if (s.isEmpty())
            return -1;
        return minEle;
    }

    /* returns poped element from stack */
    int pop() {
        if (s.isEmpty())
            return -1;
        int p = s.peek();
        s.pop();

        if (minEle < p)
            return (p + minEle) / 2;

        int prevMinEle = 2 * minEle - p;
        minEle = prevMinEle;
        return (p + prevMinEle) / 2;
    }

    /* push element x into the stack */
    void push(int x) {
        s.add(2 * x - minEle);
        if (x < minEle)
            minEle = x;
    }
}
