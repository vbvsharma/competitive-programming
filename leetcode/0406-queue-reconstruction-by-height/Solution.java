class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (int[] a, int[] b) -> a[1] < b[1] || (a[1] == b[1] && a[0] < b[0]) ? -1 : 1);
        
        Node ans = null;
        for (int i = 0; i < people.length; i++) {
            if (ans == null) {
                ans = new Node(people[i][0], people[i][1]);
            } else {
                Node curr = ans, prev = null;
                Node bestPrev = curr;
                int count = 0;
                while (curr != null) {
                    if (curr.h >= people[i][0])
                        count++;
                    if (count == people[i][1])
                        bestPrev = curr;
                    prev = curr;
                    curr = curr.next;
                }
                
                Node tmp = bestPrev.next;
                bestPrev.next = new Node(people[i][0], people[i][1]);
                bestPrev.next.next = tmp;
            }
        }
        
        Node curr = ans, prev = null;
        int i = 0;
        while (curr != null) {
            people[i][0] = curr.h;
            people[i][1] = curr.k;
            i++;
            curr = curr.next;
        }
        
        return people;
    }
}

class Node {
    int h, k;
    Node next;
    Node(int h, int k) {
        this.h = h;
        this.k = k;
    }
}