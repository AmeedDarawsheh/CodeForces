#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    vector<int> x(4);
    for (int i = 0; i < 4; i++)
    {
        cin >> x[i];
    }

    sort(x.begin(), x.end());
    int sum = x[3]; // a + b + c

    int a = sum - x[2];
    int b = sum - x[1];
    int c = sum - x[0];

    cout << a << " " << b << " " << c << "\n";

    return 0;
}
