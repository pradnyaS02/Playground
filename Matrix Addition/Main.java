#include<iostream>
#include<cstdlib>
using namespace std;
int** createArray(int r,int c){
 
  int **arr=new int*[r];
  for(int i=0;i<r;i++){
   arr[i]=(int*)calloc(c,sizeof(int));
  }
  
  return arr;
  
}

int getElement(int** arr,int r,int c){
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    cin>>arr[i][j]; 
   }
  }
  return 1;
  }
  


int addMatrix(int**a1,int**a2,int**a3,int r,int c){
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    a3[i][j]=a1[i][j]+a2[i][j];
     
   }
  }
  return 1;
}
int main()
{
  int r,c;
  cin>>r>>c;
  
  
  int **arr1=createArray(r,c);
  int **arr2=createArray(r,c);
  int **arr3=createArray(r,c);
  int a=getElement(arr1,r,c);
  int b=getElement(arr2,r,c);
  if(a==1&&b==1){
    a=addMatrix(arr1,arr2,arr3,r,c);
    
  }
  if(a==1){
    for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    cout<<arr3[i][j]<<" ";    
   }
      cout<<"\n";
  }
  }
  
}