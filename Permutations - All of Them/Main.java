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
set<string> ans;
void fun(string s,vector<int> used,deque<char> q)
{
	if(q.size()!=s.length())
	{
	   for(int i=0;i<s.length();i++)
	   {
	   	//cout<<s[i]<<" "<<used[i]<<nl;
	   	if(!used[i])
	   	{
	   	   q.push_back(s[i]);
	   	   used[i]=1;
	   	   fun(s,used,q);
	   	   q.pop_back();
	   	   used[i]=0;
	   	}
	   }
	}
	else
	{
		string a="";
		while(!q.empty())
		{
			a=a+q.front();
			q.pop_front();
		}
		//cout<<a<<nl;
		ans.insert(a);
	}
}
int main()
{
	crap;
	string s;
	cin>>s;
	vector<int> used(s.length(),0);
	deque<char> q;
	fun(s,used,q);
	for(string i:ans)
	{
		cout<<i<<nl;
	}
	ans.clear();
return 0;
}