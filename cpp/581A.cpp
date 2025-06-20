#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int a, b;
    cin >> a >> b;

    int fashion_days = min(a, b);
    int remaining = abs(a - b);
    int same_days = remaining / 2;

    cout << fashion_days << " " << same_days << "\n";

    return 0;
}
