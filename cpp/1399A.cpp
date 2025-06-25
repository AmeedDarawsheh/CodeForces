#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    short count = 0;
    cin >> count;

    for (int i = 0; i < count; i++) {
        int n;
        cin >> n;

        vector<short> a(n);
        for (int j = 0; j < n; j++) {
            cin >> a[j];
        }

        sort(a.begin(), a.end());

        bool possible = true;
        for (int j = 1; j < n; j++) {
            if (a[j] - a[j - 1] > 1) {
                possible = false;
                break;
            }
        }

        cout << (possible ? "YES" : "NO") << '\n';
    }

    return 0;
}
