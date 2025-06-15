#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;

    while (t--) {
        string s;
        cin >> s;

        for (int i = 0; i < s.size(); ++i) {
            s[i] = tolower(s[i]);
        }

        if (s == "yes") {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }

    return 0;
}
