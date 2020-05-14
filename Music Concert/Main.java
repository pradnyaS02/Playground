#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int no,f=0,m=0;
  
  cin>>no;
  int *p=(int*)malloc(no*sizeof(int));
  for(int i=0;i<no;i++){
   cin>>*(p+i); 
  }
  for(int i=0;i<no;i++){
   if(*(p+i)%2==0)
     f++;
    else
      m++;
  }
  cout<<m<<"\n"<<f;
  
  
  return 0;
}