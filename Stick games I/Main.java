#include<iostream>
#include<cstdlib>
using namespace std;


void chance(int m,int n,int *p[] ){
   int res;
   if(n < m)
    {
        res = n;
    }
    else
    {
        res = m;
    }
    if(res % 2 == 0)
    {
        cout<<"Mani Iyer";
    }
    else
    {
        cout<<"Arun Gupta";
    }
   
   
   
   
 }
 
  
  


int main()
{
  int m,n,turn=0;
  cin>>m>>n;
  int avail=m*n,*p[m];
  
  for(int i=0;i<m;i++)
    p[i]=(int*)calloc(n,sizeof(int));
  
  for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
  		p[i][j]=1;
  
  
  
  chance(m,n,p);
  
  
  
  
}