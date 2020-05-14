#include<iostream>
using namespace std;
struct College { 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  College c[n];
for(int i=0;i<n;i++){
 cout<<"\nEnter the details of college "<<i+1; 
 cout<<"\nEnter name";
  cin>>c[i].name;
 cout<<"\nEnter city";
  cin>>c[i].city;
 cout<<"\nEnter year of establishment";
   cin>>c[i].establishmentYear;
 cout<<"\nEnter pass percentage";
   cin>>c[i].passPercentage;
}
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++){
 cout<<"\nCollege:"<<i+1; 
 cout<<"\nName:"<<c[i].name;
 cout<<"\nCity:"<<c[i].city;
 cout<<"\nYear of establishment:"<<c[i].establishmentYear;
 cout<<"\nPass percentage:"<<c[i].passPercentage;
  
}
}