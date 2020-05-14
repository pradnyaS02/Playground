#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr[r][c];
  int big[r];
  
 for(int i=0;i<r;i++){
   big[i]=0;
  for(int j=0;j<c;j++){
   cin>>arr[i][j]; 
  }
 }
  
  for(int i=0;i<c;i++){
    
  for(int j=0;j<r;j++){
    if(big[i]<arr[j][i]){
     big[i]=arr[j][i]; 
    }
  }
    cout<<big[i]<<"\n";
 }
  
  
  
  
}