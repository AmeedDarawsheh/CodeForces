#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    short t;
    cin >> t;
    string codeforces = "codeforces";
    while (t--)
    {
        char c;
        cin >> c;
        if (codeforces.find(c) != string::npos)
        {
            cout << "YES" << '\n';
        }
        else
        {
            cout << "NO" << '\n';
        }
    }
    return 0;
}