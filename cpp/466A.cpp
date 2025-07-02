#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m, a, b;
    cin >> n >> m >> a >> b;

    int cost_single = n * a;
    int cost_full_passes = ((n + m - 1) / m) * b;
    int cost_mixed = (n / m) * b + (n % m) * a;

    cout << min({cost_single, cost_full_passes, cost_mixed}) << '\n';

    return 0;
}
