#include <bits/stdc++.h>
using namespace std;

int main() {
    short t;
    cin >> t;
    while (t--) {
        short n;
        cin >> n;
        if (n % 4 == 0)
            cout << "Bob\n";
        else
            cout << "Alice\n";
    }
    return 0;
}
