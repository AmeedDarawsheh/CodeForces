#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int x;
    cin >> x;
    int count = 0;

    while (x > 0)
    {
        if (x % 2 == 1)
            count++;
        x /= 2;
    }
  
    cout << count << "\n";

    return 0;
}