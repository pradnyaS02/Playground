#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str[5];
  for(int i=0;i<5;i++){
   cin>>str[i];
    if(str[i]=="####")
      break;
    if(i>0){
    if(str[i-1].back()!=str[i].front()){
     i--;
    }
       
       }
  }
  
  for(int i=0;str[i]!="####";i++){
   cout<<str[i]<<"\n"; 
  }
  
}