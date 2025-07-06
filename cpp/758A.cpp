#include <iostream>
#include <vector>
#include <algorithm>
// #include <bits/stdc++.h>   use this line if you want to include all standard libraries
using namespace std;

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int t = 0;
    cin >> t;
    int a[t];

    int max = 0;
    for (int i = 0; i < t; i++)
    {
        cin >> a[i];
        if (a[i] > max)
        {
            max = a[i];
        }
    }
    int count = 0;
    for (int i = 0; i < t; i++)
    {

        count = count + abs((max - a[i]));
    }

    return 0;
}