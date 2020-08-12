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
int fun(vector<int> &v,vector<int> &r,int n,int lm)
{
	if(n==0)
	{
		return 0;
	}
	else
	{
		//if(r[n]!=-1)
		//	return r[n];
		int f=0;
		int s=0;
		//cout<<n<<" "<<lm<<nl;
		if(lm>v[n-1])
           f=1+fun(v,r,n-1,v[n-1]);
		s=fun(v,r,n-1,lm);
		return max(f,s);
	}
}
int main()
{
	crap;
	int n;
	cin>>n;
	vector<int> v(n,0);
	vector<int> r(n+1,-1);
	for(int i=0;i<n;i++)
	{
		cin>>v[i];
	}
	cout<<fun(v,r,n,INT_MAX);
return 0;
}