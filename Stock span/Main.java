#include<iostream>
using namespace std;
void stockSpan(int a,int* arr){
  int v=1,i=0,p;
   while(i<a){
     if(i==0){
       cout<<"1 \n";}
    else{if(arr[i]<=arr[i-1])
      	cout<<"1 \n";
     else{
       
       p=2*(v);
       v=v+1;
     cout<<p<<"\n";}}
      i++;
   }
}
  
int main()
{
  int a,i=0;
  int* arr;
  cin>>a;
  while(i<a){
    cin>>arr[i];
    i++;
  }
  stockSpan(a,arr);
  
}