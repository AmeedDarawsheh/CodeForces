#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        int a, b, c;
        cin >> a >> b >> c;
        int max_val = max({a, b, c});
        int min_val = min({a, b, c});
        int mid_val = a + b + c - max_val - min_val;
        cout << mid_val << "\n";
    }

    return 0;
}