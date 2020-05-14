#include<iostream>
using namespace std;

int evenodd(int *n,int *p){
  bool odd,even;
 for(int i=0;i<*n;i++){
   if(p[i]%2==0)
     even=true;
   else
     odd=true;  
 }
  
  if(odd==1&&even==1)
    return 3;
  else if(odd==1)
    return 2;
  else
    return 1;
  
  
}

int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int p[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>p[i];
  
  int res=evenodd(&n,p);
  
  if(res==1)
    cout<<"\nThe array is Even";
  else if(res==2)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
  
}