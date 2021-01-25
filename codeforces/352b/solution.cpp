#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0);
    ios_base::sync_with_stdio(false);

    int n;
    cin >> n;
    int sz = 100000 + 10;
    vector<vector<int>> map(sz);

    bool invalid[sz];
    fill(invalid, invalid + sz, false);
        
    int count = 0;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;

        if (invalid[x])
            continue;
        
        if (map[x].size() <= 1) {
            map[x].push_back(i);
            if (map[x].size() == 1)   count++;
        } else {
            // Size == 2
            if (2 * map[x][1] == i + map[x][0]) {
                map[x][0] = map[x][1];
                map[x][1] = i;
            } else {
                invalid[x] = true;
                count--;
            }
        }
    }

    cout << count << "\n";

    for (int i = 0; i < sz; i++) {
        if (invalid[i] || map[i].empty())
            continue;

        if (map[i].size() == 1)
            cout << i << " " << 0 << "\n";
        else
            cout << i << " " << (map[i][1] - map[i][0]) << "\n";
    }
}