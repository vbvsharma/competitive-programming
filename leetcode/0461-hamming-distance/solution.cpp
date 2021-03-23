class Solution {
public:
    int hammingDistance(int x, int y) {
        int xo = x ^ y;
        int ham_dist = 0;
        while (xo) {
            ham_dist += xo & 1;
            xo = xo >> 1;
        }
        return ham_dist;
    }
};