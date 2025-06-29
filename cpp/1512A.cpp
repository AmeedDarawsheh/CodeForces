#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    short t;
    cin >> t;

    while (t--)
    {
        short n;
        cin >> n;
        vector<short> v(n);

        for (int i = 0; i < n; i++)
        {
            cin >> v[i];
        }

        short common;

        if (v[0] == v[1] || v[0] == v[2])
        {
            common = v[0];
        }
        else
        {
            common = v[1];
        }

        for (int i = 0; i < n; i++)
        {
            if (v[i] != common)
            {
                cout << i + 1 << '\n';
                break;
            }
        }
    }

    return 0;
}
