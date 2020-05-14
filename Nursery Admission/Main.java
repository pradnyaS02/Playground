#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  cout<<"The number of letters in the name is "<<str.length();
}