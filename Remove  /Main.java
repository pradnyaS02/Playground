#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  
  
  
  
  for(int i=0;str[i]!='\0';i++){
   int found=str.find("the");
  //cout<<found;
  if(found>0){
  
  str.erase (found,4);
  
}
else{

cout<<str;
return 0;
}
    
}
}