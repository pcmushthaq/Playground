#include <iostream> 
using namespace std; 
  
int main() 
{ 
    // variable declaration 
    int n1, n2 , min; 
  cin >> n1;
  cin >> n2;
  
    // Largest among n1 and n2 
    min = (n1 < n2) ? n1 : n2; 
  	cout << min <<" is smallest number";
  return 0;
}