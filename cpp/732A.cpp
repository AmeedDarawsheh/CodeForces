#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int k, r;
    cin >> k >> r;

    for (int t = 1; t <= 10; t++) {
        int total = t * k;
        if (total % 10 == 0 || total % 10 == r) {
            cout << t << '\n';
            break;
        }
    }

    return 0;
}
