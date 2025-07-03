#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string input;
    getline(cin, input);
    if(isupper(input[0])) {
        cout << input;
    } else {
        input[0] = toupper(input[0]);
        cout << input;
    }

    return 0;
}