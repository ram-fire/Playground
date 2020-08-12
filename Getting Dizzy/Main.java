#include<bits/stdc++.h>
#define mod 1000000007
#define ppi pair<int,pair<int,int> >
#define ll long long
#define pb push_back
#define pob pop_back
#define mp make_pair
#define f first
#define s second
#define fin for(ll i=0;i<n;i++)
#define nl "\n"
#define crap ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
using namespace std;
int main()
{
	crap;
	int r;
	cin>>r;
	int c=r;
	vector<vector<int> > arr(r,vector<int> (c));
	int k=1;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			cin>>arr[i][j];
		}
	}
	int rounds=ceil(((double)r)/2);
	for(int i=0;i<rounds;i++)
	{
		//right side
		for(int j=i;j<c-i;j++)
		{
			cout<<arr[i][j]<<" ";
		}
		//down
		for(int j=i+1;j<r-i;j++)
		{
			cout<<arr[j][c-1-i]<<" ";
		}
		//left
		for(int j=c-1-i-1;j>=i;j--)
		{
			cout<<arr[r-1-i][j]<<" ";
		}
		//up
		for(int j=r-1-i-1;j>i;j--)
		{
			cout<<arr[j][i]<<" ";
		}
	}
return 0;
}