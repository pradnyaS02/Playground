#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  int v=0,c=0,w=0,d=0,s=0;
  getline(cin,str);
  
  for(string::iterator i=str.begin();i<str.end();i++){
  	
  	if(*i>='A'&&*i<='Z'){
  		
  		if(*i=='A'||*i=='E'||*i=='I'||*i=='O'||*i=='U')
  		v++;
  		else
  		c++;
  		
	  }
	  
	else if(*i>='a'&&*i<='z'){
  		
  		if(*i=='a'||*i=='e'||*i=='i'||*i=='o'||*i=='u')
  		v++;
  		else
  		c++;
  		
	  }
  	
  	else if(*i==32)
  	w++;
  	
  	else if(*i>='0'&&*i<='9')
  	d++;
  	
  	else
  	s++;
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w;
  cout<<"\nDigits:"<<d<<"\nSymbols:"<<s;
  
}