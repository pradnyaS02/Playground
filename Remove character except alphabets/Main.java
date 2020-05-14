#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  cin>>str;
  
  for(string::iterator i=str.begin();i!=str.end();i++){
   if(((*i>=65)&&(*i<=90))||((*i>=97)&&(*i<=122))){
     cout<<*i;
   }
  }
  
}