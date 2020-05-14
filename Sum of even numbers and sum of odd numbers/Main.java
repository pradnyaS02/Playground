#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,odd=0,even=0;
  cin>>n;
  int p[n];
  for(int i=0;i<n;i++)
   cin>>p[i]; 
    for(int i=0;i<n;i++){
     if(p[i]%2==0)
       even=even+p[i];
      else
        odd=odd+p[i];
    }
  
    
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}