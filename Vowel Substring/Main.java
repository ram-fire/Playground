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
bool isVowel(char x) 
{ 
    return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'); 
} 
int main()
{
	crap;
	string s;
	cin>>s;
	set<char> se;
	int ans=0;
	for(int i=0;i<s.size();i++)
	{
		for(int j=i;j<s.size();j++)
		{
            if(isVowel(s[j]))
            	se.insert(s[j]);
            else
            	break;
            if(se.size()==5)
            	ans++;
		}
		se.clear();
	}
    cout<<ans<<nl;
return 0;
}