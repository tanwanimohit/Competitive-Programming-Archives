//The code solves the median in a stream of integers problem
//It makes use of the AVL tree property where abs(height of left subtree-height of right subtree)<=1
//Author : Ayush Dubey

#include <bits/stdc++.h>
using namespace std;
#define ll long long int
#define in(j,n) for(j=0;j<n;j++)
#define inp(j,n) for(j=1;j<=n;j++)
#define lo(i,st,n) for(i=st;i<n;i++)
#define pb push_back
int main()
{
	ll i,j,n,x,root;
	cin>>n;
	priority_queue < ll > left;
	priority_queue < ll , vector< ll >, greater< ll > > right; 
	in(i,n)
	{
		cin>>x;
		if(i==0)
		{
			root=x;
			cout<<root<<endl;
			continue;
		}
		if(x>root)
		{
			right.push(x);
			while(right.size()-left.size()>1)
			{
				left.push(root);
				root=right.top();
				right.pop();
			}
		}
		else
		{
			left.push(x);
			while(left.size()-right.size()>1)
			{
				right.push(root);
				root=left.top();
				left.pop();
			}
		}
		if(i%2==0)
			cout<<root<<endl;
		else
		{
			ll temp=0;
			if(left.size()>right.size())
				temp=left.top();
			else
				temp=right.top();
			ll avg=(root+temp)/2;
			cout<<avg<<endl;
		}
	}
	return 0;
}