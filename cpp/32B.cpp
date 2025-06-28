#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;
    cin >> s;

    string result = "";

    for (int i = 0; i < s.size();)
    {
        if (s[i] == '.')
        {
            result += '0';
            i++;
        }
        else if (s[i] == '-' && i + 1 < s.size())
        {
            if (s[i + 1] == '.')
            {
                result += '1';
            }
            else if (s[i + 1] == '-')
            {
                result += '2';
            }
            i += 2;
        }
    }

    cout << result << '\n';
    return 0;
}
