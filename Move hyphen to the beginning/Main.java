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
	string s;
	cin>>s;
	int count=0;
	for(int i=0;i<s.size();i++)
	{
		if(s[i]=='-')
			count++;
	}
	while(count--)
	{
		cout<<"-";
	}
	for(int i=0;i<s.size();i++)
	{
		if(s[i]!='-')
			cout<<s[i];
	}
return 0;
}