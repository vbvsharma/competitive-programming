class Solution {
public:
    double myPow(double x, int n) {
        if (n == 0)
            return 1;
            
        double tmp = myPow(x, n / 2);
        if (n % 2 == 0)        
            return tmp * tmp;
        else if (n > 0)
            return tmp * tmp * x;
        else
            return tmp * tmp * (1 / x);
    }
};