#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    short count;
    cin >> count;

    for (int i = 0; i < count; i++) {
        short input;
        cin >> input;
        short result = input % 10 + input / 10;
        cout << result << "\n";
    }

    return 0;
}
