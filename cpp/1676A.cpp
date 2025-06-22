#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    short t = 0;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;

        int left_sum = (s[0] - '0') + (s[1] - '0') + (s[2] - '0');
        int right_sum = (s[3] - '0') + (s[4] - '0') + (s[5] - '0');

        if (left_sum == right_sum)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
