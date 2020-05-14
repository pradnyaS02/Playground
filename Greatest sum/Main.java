#include<iostream>
using namespace std;
int main()
{
  int r,c,rb=0,cb=0;
  cin>>r>>c;
  int arr[r][c];
  int sumr[r],sumc[c];
  
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){ 
   cin>>arr[i][j]; 
   }   
  }
  
  for(int i=0;i<r;i++){
     sumc[i]=0;
    sumr[i]=0;
   for(int j=0;j<c;j++){ 
   sumr[i]=sumr[i]+arr[i][j];
     sumc[i]=sumc[i]+arr[j][i];
   }      
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    cout<<sumr[i]<<" ";
    if(sumr[rb]<sumr[i]){
     rb=i;      
    }       
  }
    cout<<"\nRow "<<rb+1<<" has maximum sum";
  
  cout<<"\nSum of columns is ";
 for(int i=0;i<r;i++){
    cout<<sumc[i]<<" ";
    if(sumc[cb]<sumc[i]){
     cb=i;      
    }       
  }
  cout<<"\nColumn "<<cb+1<<" has maximum sum";
}