#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int ele,big=0;
  
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    cin>>ele;
     if(big<ele)
       big=ele;
   }
  }
  
  cout<<"The maximum element is "<<big;
  
}