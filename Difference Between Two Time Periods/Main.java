#include <iostream>
using namespace std;

struct TIME
{
  int seconds;
  int minutes;
  int hours;
}t1,t2;

int main(){
  
  cin>>t1.hours>>t1.minutes>>t1.seconds;
  cin>>t2.hours>>t2.minutes>>t2.seconds;
  
  if(t2.seconds > t1.seconds)
    {
        --t1.minutes;
        t1.seconds += 60;
    }
   
  
   if(t2.minutes > t1.minutes)
    {
        --t1.hours;
        t1.minutes += 60;
    }
  cout<<t1.hours-t2.hours<<":";
  cout<<t1.minutes-t2.minutes<<":";
   cout<<t1.seconds-t2.seconds;

  
}