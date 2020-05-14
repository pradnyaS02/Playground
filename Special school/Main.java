#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2;
  cin>>str1>>str2;
  string::iterator j=str2.end();
  j--;
 for(string::iterator i=str1.begin();i!=str1.end();i++){
   if(*i!=*j){
     cout<<"It is wrong";
     return 0;
   }
   j--;
 }
  cout<<"It is correct";
  
}