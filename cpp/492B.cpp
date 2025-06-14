#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, l;
    cin >> n >> l;

    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    sort(a.begin(), a.end());

    
    double max_gap = 0;
    for (int i = 1; i < n; i++) {
        max_gap = max(max_gap, (double)(a[i] - a[i - 1]));
    }

 
    double left_edge = a[0] - 0;
    double right_edge = l - a[n - 1];

    
    double result = max({max_gap / 2.0, left_edge, right_edge});

    
    cout << fixed << setprecision(10) << result << '\n';

    return 0;
}
