#include <iostream>
#include<string>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s1;
 
  cin.get(s1.name, 50);
  cin>>s1.roll;
  cin>>s1.marks;
  
  cout<<"\nStudent Details"<<endl;
  cout<<"Name: "<<s1.name<<endl;
  cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks<<endl;
}