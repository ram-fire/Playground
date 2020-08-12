#include<bits/stdc++.h>
#define mod 1000000007
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
		string s1,s2;
        cin>>s1>>s2;
        vector<vector<int> > r(s1.size()+1,vector<int> (s2.size()+1,0));
        for(int i=1;i<=s1.size();i++)
        {
        	for(int j=1;j<=s2.size();j++)
        	{
        		if(s1[i-1]==s2[j-1])
        			r[i][j]=1+r[i-1][j-1];
        		else
        		{
        			r[i][j]=max(r[i-1][j],r[i][j-1]);
        		}
        	}
        }
        cout<<r[s1.size()][s2.size()]<<nl;
return 0;
}