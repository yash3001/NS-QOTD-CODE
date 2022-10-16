#include <iostream>
using namespace std;
 
int main()
{
    ios_base::sync_with_stdio(false);
    string s;
    cin >> s;
    cout << string(s.size(), 'x') << endl;
    return 0;
}