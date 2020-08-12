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
int fun(string s1,string s2,int n,int m,vector<vector<int> > &r)
{
	if(m==0)
	{
		r[m][n]=n;
		return n;
	}
	if(n==0)
	{
		r[m][n]=m;
		return m;
	}
	else
	{
		if(r[m][n]!=-1)
			return r[m][n];
		if(s1[n-1]==s2[m-1])
		{
			return r[m][n]=fun(s1,s2,n-1,m-1,r);
		}
		else
		{
			int f=1+fun(s1,s2,n,m-1,r);
            int s=1+fun(s1,s2,n-1,m,r);
            int third=1+fun(s1,s2,n-1,m-1,r);
			return r[m][n]=min(third,min(f,s));
		}
	}
}
int main()
{
	crap;
	string s1,s2;
	cin>>s1>>s2;
	int n,m;
	n=s1.size();
	m=s2.size();
	vector<vector<int> > r(m+1,vector<int> (2*n,-1));
    cout<<fun(s1,s2,n,m,r);
return 0;
}