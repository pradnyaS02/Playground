#include<iostream>
#include<string>
using namespace std;
struct employees{
 string name;
  int id;
  int age;
  string designation;
  int sal;
};
int main()
{
  struct employees emp;
  
  cout<<"Enter name:";
  cin>>emp.name;
  cout<<"\nEnter ID:";
   cin>>emp.id;
  cout<<"\nEnter age:";
   cin>>emp.age;
  cout<<"\nEnter designation:";
   cin>>emp.designation;
  cout<<"\nEnter Salary:";
   cin>>emp.sal;
  
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<emp.name;
  cout<<"\nID of the Employee : "<<emp.id;
  cout<<"\nAge of the Employee : "<<emp.age;
  cout<<"\nDesignation of the Employee : "<<emp.designation;
  cout<<"\nSalary of the Employee : "<<emp.sal;
  
}