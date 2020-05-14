#include <cstring>
#include <iostream>
using namespace std;
int main()
{
    string str;
    int count=0;
  getline(cin,str);
  
  for(int i=0;str[i]!='\0';i++){
   int found=str.find("the");
  //cout<<found;
  if(found>0){
  count++;
 
  
	}
	if(count>10){
		
		cout<<"Caption not eligible for the contest";
		return 0;
	}
   
}
  if(count<=10){
    cout<<"Caption eligible for the contest";
  }
}