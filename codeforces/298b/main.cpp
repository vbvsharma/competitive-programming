#include <bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0);
    ios_base::sync_with_stdio(false);

    int t, sX, sY, eX, eY;
    cin >> t >> sX >> sY >> eX >> eY;

    if (sX == eX && sY == eY) {
        cout << 0;
        return 0;
    }

    int ans = -1;
    for (int i = 1; i <= t; i++) {
        char ch;
        cin >> ch;

        if (ch == 'E' && sX < eX)
            sX++;
        else if (ch == 'S' && eY < sY)
            sY--;
        else if (ch == 'W' && eX < sX)
            sX--;
        else if (ch == 'N' && sY < eY)
            sY++;

        if (sX == eX && sY == eY) {
            ans = i;
            break;
        }
    }

    cout << ans;

    return 0;
}