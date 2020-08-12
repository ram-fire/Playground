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
int ans=0;
void fun(int n,int s)
{
	if(s==n)
	{
		ans++;
		return;
	}
	if(s>n)
	{
		return;
	}
	else
	{
        fun(n,s+1);
        fun(n,s+2);
	}
}
int main()
{
	crap;
	int n;
	cin>>n;
	fun(n,0);
	cout<<ans;
return 0;
}