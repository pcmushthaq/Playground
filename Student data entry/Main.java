#include<iostream>
#include<cstring>
using namespace std;
struct student
{
  char name[50];
  int roll;
  int marks;
};
int main(){
struct student s;
cin.get(s.name,50);
cin>>s.roll;
cin>>s.marks;
cout<<"\nStudent Details";
cout<<"\nName: "<<s.name;
cout<<"\nRoll: "<<s.roll;
cout<<"\nMarks: "<<s.marks;
return 0;
}