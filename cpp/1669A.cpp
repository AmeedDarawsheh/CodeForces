#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t = 0  , rating = 0 ; 
    
    cin >> t;
    while (t--) {
        cin >> rating;
        if (rating < 1400) {
            cout << "Division 4\n";
        } else if (rating < 1600) {
            cout << "Division 3\n";
        } else if (rating < 1900) {
            cout << "Division 2\n";
        } else {
            cout << "Division 1\n";
        }
    }

    return 0;
}