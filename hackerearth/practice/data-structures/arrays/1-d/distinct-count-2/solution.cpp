// https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/golf/distinct-count-2/

#include<bits/stdc++.h>
using namespace std;

int main() {
	map<int, int> freq;
	int N;
	cin >> N;

	int maxN = 0, maxFreq = 0;
	while (N--) {
		int x;
		cin >> x;
		
		if (freq.find(x) == freq.end())
			freq[x] = 1;
		else
			freq[x]++;

		if (maxFreq < freq[x]) {
			maxFreq = freq[x];
			maxN = x;
		} else if (maxFreq == freq[x] && x < maxN) {
			maxN = x;
		}
	}

	cout << maxN;

	return 0;
}