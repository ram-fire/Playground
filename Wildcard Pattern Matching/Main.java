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
bool strmatch(string str,string pattern,int n, int m) 
{ 
	if (m == 0) 
		return (n == 0); 
	vector<vector<bool> > lookup(n+1,vector<bool> (m+1,false)); 
	lookup[0][0] = true; 
	for (int j = 1; j <= m; j++) 
		if (pattern[j - 1] == '*') 
			lookup[0][j] = lookup[0][j - 1]; 
	for (int i = 1; i <= n; i++) 
	{ 
		for (int j = 1; j <= m; j++) 
		{ 
			
			if (pattern[j - 1] == '*') 
				lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j]; 
			else if (pattern[j - 1] == '?' || str[i - 1] == pattern[j - 1]) 
				lookup[i][j] = lookup[i - 1][j - 1]; 
			else 
				lookup[i][j] = false; 
		} 
	} 

	return lookup[n][m]; 
} 
int main() 
{ 
	
	string str,pattern;
	cin>>str;
	cin>>pattern;
	if(strmatch(str,pattern,str.size(),pattern.size()))
	{
       cout<<"true"<<nl;
	}  
	else
		cout<<"false"<<nl;
	return 0; 
}	
