#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int count;
    cin >> count;

    for (int i = 0; i < count; i++) {
        int a, b, c;
        cin >> a >> b >> c;

        if (a + b == c)
            cout << "+" << '\n';
        else
            cout << "-" << '\n';
    }

    return 0;
}
