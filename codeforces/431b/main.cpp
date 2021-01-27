#include <bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0);
    ios_base::sync_with_stdio(false);
    
    int happiness[5][5];
    for (int i = 0; i < 5; i++)
        for (int j = 0; j < 5; j++)
            cin >> happiness[i][j];
    
    int q[] = {0, 1, 2, 3, 4};
    int maxHappiness = 0;
    do {
        int tmp = happiness[q[0]][q[1]] + happiness[q[1]][q[0]] +
                    2 * happiness[q[2]][q[3]] + 2 * happiness[q[3]][q[2]] +
                    happiness[q[1]][q[2]] + happiness[q[2]][q[1]] +
                    2 * happiness[q[3]][q[4]] + 2 * happiness[q[4]][q[3]];
        maxHappiness = max(maxHappiness, tmp);
    } while (next_permutation(q, q + 5));

    cout << maxHappiness << "\n";

    return 0;
}