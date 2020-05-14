#include<iostream>
#include<cstring>
using namespace std;
struct Student { 
  char name[30];                
  char department[20];
  int yearOfStudy; 
  float cgpa; 
}; 
int main()
{
  int n;
  cout<<"Enter the number of students";
  cin>>n;
  Student s[n],swap;
  for(int i=0;i<n;i++){
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter department";
    cin>>s[i].department;
    cout<<"\nEnter year of study";
    cin>>s[i].yearOfStudy;
    cout<<"\nEnter cgpa";
    cin>>s[i].cgpa;
    
  }
   for(int k=0;k<n-1;k++){
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    
    if(s[i].name>s[j].name){
     strcpy(swap.name,s[i].name);
     strcpy(swap.department,s[i].department);
 	 swap.yearOfStudy=s[i].yearOfStudy;
     swap.cgpa=s[i].cgpa;
      
      strcpy(s[i].name,s[j].name);
       strcpy(s[i].department,s[j].department);
       s[i].yearOfStudy=s[j].yearOfStudy;
       s[i].cgpa=s[j].cgpa;
          
      strcpy(s[j].name,swap.name);
      strcpy(s[j].department,swap.department);
      s[j].yearOfStudy=swap.yearOfStudy;
      s[j].cgpa=swap.cgpa;
    }
    
  }
  }
}
  cout<<"\nDetails of students";
   for(int i=0;i<n;i++){
    cout<<"\nStudent "<<i+1;
    cout<<"\nName:"<<s[i].name;
    cout<<"\nDepartment:"<<s[i].department;
    cout<<"\nYear of study:"<<s[i].yearOfStudy;
    cout<<"\nCGPA:"<<s[i].cgpa;    
  }
 
  
}