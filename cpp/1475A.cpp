#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--) {
        long long n;
        cin >> n;

        // Check if n is a power of 2
        if ((n & (n - 1)) == 0)
            cout << "NO\n";
        else
            cout << "YES\n";
    }

    return 0;
}
