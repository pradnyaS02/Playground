#include<iostream>
#include<cstdlib>
using namespace std;
int printresult(int*p,int n,int s){
  int grt=0;
 for(int i=0;i<n;i++){
   grt=grt+p[i];
 }
  if(grt<=s)
    return 1;
  else
    return 0;
}

int main()
{
  int n,s;
  cin>>n>>s;
  int *p=(int*)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
    cin>>p[i];
  
  if(printresult(p,n,s)==1)
    cout<<"YES";
  else
    cout<<"NO";
  
  
}