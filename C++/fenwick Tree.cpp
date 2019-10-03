#include <bits/stdc++.h>
using namespace std;

#define rep(i,n) for(auto i=0; i<(n); i++)
#define mem(x,val) memset((x),(val),sizeof(x));
#define all(x) x.begin(),x.end()
#define sz(x) ((int)x.size())
#define sqr(x) ((x)*(x))
#define pb push_back
#define clr clear()

#define trace1(x)                cerr << #x << ": " << x << "\n";
#define trace2(x, y)             cerr << #x << ": " << x << " | " << #y << ": " << y << "\n";
#define trace3(x, y, z)          cerr << #x << ": " << x << " | " << #y << ": " << y << " | " << #z << ": " << z << "\n";

#define xx first
#define yy second
#define ll long long

typedef long long i64;
typedef unsigned long long ui64;
typedef string st;
typedef vector<int> vi;
typedef vector<st> vs;
typedef map<int,int> mii;
typedef map<st,int> msi;
typedef set<int> si;
typedef set<st> ss;
typedef pair<int,int> pii;
typedef vector<pii> vpii;

#define MAX_N 100

class FenwickTree{
private:
    int size;
    int MaxIdx;
    int tree[MAX_N];
    int cumFreq[MAX_N];

public:

    FenwickTree(int arr[], int n)
    {
        tree[0] = 0;
        size = n;

        ll cumArray[n+1] = {0};
        for(int i=1; i<= n; i++)
        {
            cumArray[i] = cumArray[i-1] + arr[i-1];
        }
        for(int i=1; i<= n; i++)
        {
            tree[i] = cumArray[i] - cumArray[i-(i&-i)];
        }
        MaxIdx = n;

    }
    int read(int idx)
    {
        int sum = 0;
        while(idx > 0)
        {
            sum += tree[idx];
            idx = idx - (idx&(-idx));
        }
        return sum;
    }

    void update(int idx, int val)
    {
        while(idx <= MaxIdx)
        {
            tree[idx] += val;
            idx += idx&(-idx);
        }
    }
};
int main() {


    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int arr[] = {2,3,5,2,1,4,9};
    int n = sizeof(arr)/sizeof(int);

    FenwickTree Ftree(arr,n);
    cout << Ftree.read(7) << endl;

    return 0;
}
