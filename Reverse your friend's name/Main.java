#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
string name,nameulta;
  int j=0;
getline(cin,name);
//int last=name.size();
 
 nameulta.resize(name.size());
  for(int i=(name.size()-1);i>=0;i--){
   nameulta[j]=name[i];
    j++;
    
  }
  nameulta[j]='\0';
  
  cout<<nameulta;
  
}