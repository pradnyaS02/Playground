#include<iostream>
using namespace std;
int main()
{
  int r,c,add=0;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++) {
     cin>>arr[i][j];
   }
  }
  
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++) {
     if(i==0||i==(r-1)){
      add=add+arr[i][j]; 
       
     }
     else if(j==(c-i-1)){
     add=add+arr[i][j];
       
     }
   }
  }
  
  cout<<"Sum of Zig-Zag pattern is "<<add;
  
}