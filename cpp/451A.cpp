#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    short n, m;
    cin >> n >> m;

    if (min(n, m) % 2 == 0)
        cout << "Malvika\n";
    else
        cout << "Akshat\n";

    return 0;
}
