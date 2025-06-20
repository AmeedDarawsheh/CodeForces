#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    long long n, m;
    cin >> n >> m;

    vector<long long> tasks(m);
    for (int i = 0; i < m; ++i) {
        cin >> tasks[i];
    }

    long long current = 1;
    long long total_time = 0;

    for (int i = 0; i < m; ++i) {
        if (tasks[i] >= current) {
            total_time += tasks[i] - current;
        } else {
            total_time += n - (current - tasks[i]);
        }
        current = tasks[i];
    }

    cout << total_time << "\n";

    return 0;
}
