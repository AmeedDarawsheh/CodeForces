#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, a, b, c, d;
    cin >> n;

    while (n--) {
        int count = 0;
        cin >> a >> b >> c >> d;
        if (b > a) count++;
        if (c > a) count++;
        if (d > a) count++;
        cout << count << '\n';
    }

    return 0;
}
