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
int arr[4][2]={{-1,0},{1,0},{0,-1},{0,1}};
int main()
{
	int m,n;
	cin>>m>>n;
	vector<vector<bool> > vis(m,vector<bool> (n,false));
	int i,j;
	cin>>i>>j;
	vis[i][j]=true;
	queue<pair<int,pair<int,int> > > q;
	q.push({1,{i,j}});
	int ans=1;
	while(!q.empty())
	{
		pair<int,int> temp=q.front().s;
		for(int k=0;k<4;k++)
		{
			int I,J;
			I=temp.f+arr[k][0];
			J=temp.s+arr[k][1];
			if(I>=0&&I<m&&J>=0&&J<n&&vis[I][J]==false)
			{
                //cout<<I<<" "<<J<<nl;
                vis[I][J]=true;
                q.push({q.front().f+1,{I,J}});
                if(ans<q.front().f+1)
                	ans=q.front().f+1;
			}
		}
		q.pop();
	}
	cout<<ans;
return 0;
}