#include <iostream> 
using namespace std; 
  
int main() 
{ 
    // variable declaration 
    int n1, n2; 
  cin >> n1;
  cin >> n2;
  
 if (n1>n2)
   cout<< "Yes, you can enter.";
  else if(n1==n2)
    cout<< "Yes, you can enter. Kindly use a rope.";
  else
    cout<< "Sorry, you can't enter";
}