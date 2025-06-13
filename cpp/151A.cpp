#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;

    int total_drink = k * l;
    int total_slices = c * d;

    int by_drink = total_drink / (n * nl);
    int by_limes = total_slices / n;
    int by_salt = p / (n * np);

    cout << min(min(by_drink, by_limes), by_salt) << '\n';

    return 0;
}