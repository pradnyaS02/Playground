#include<iostream>
using namespace std;
int main()
{
  int r,c,ele;
  cin>>r>>c;
  //int arr[r][c];
  for(int i=0;i<r;i++){
   int sumr=0;
    for(int j=0;j<c;j++){
     cin>>ele;
      sumr=sumr+ele;
   }
    cout<<sumr<<"\n";
  }
}