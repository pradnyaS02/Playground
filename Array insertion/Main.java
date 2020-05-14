#include<iostream>
#include<cstdlib>
using namespace std;
void insert(int *p,int *pos,int *n){
  int ele;
 cout<<"\nEnter the value to insert"; 
  cin>>ele;
  
  for(int i=*n;i>=*pos;i--){
    p[i]=p[i-1];
  }  
  
  p[*pos-1]=ele;
}

int main()
{
  int n,pos;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int *p=(int*)calloc(n,sizeof(int));
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>p[i];
  
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>pos;
  if(pos<=n){
    n++;
  	p=(int*)realloc(p,n*sizeof(int));
    insert(p,&pos,&n);
    
    cout<<"\nArray after insertion is\n";
  for(int i=0;i<n;i++)
    cout<<p[i]<<"\n";
    
  }
  else
    cout<<"\nInvalid Input";
  
  
  
}