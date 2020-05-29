#include <iostream>
using namespace std;

struct student
{
    char name[50],desig[50];
    int id,age,salary;
    float marks;
} s[10];

int main()
{

    // storing information
    for(int i = 0; i < 1; ++i)
    {
   

        cout << "Enter name: \n";
        cin >> s[i].name;

        cout << "Enter ID: \n";
        cin >> s[i].id;
      cout << "Enter age: \n";
        cin >> s[i].age;
      cout << "Enter designation: \n";
        cin >> s[i].desig;
      cout << "Enter Salary: \n";
        cin >> s[i].salary;

    }

    cout << "Employee Details " << endl;

    // Displaying information
    for(int i = 0; i < 1; ++i)
    {
        cout << "Name of the Employee : " << s[i].name  << endl;
        cout << "ID of the Employee : " << s[i].id << endl;
        cout << "Age of the Employee : " << s[i].age << endl;
      cout << "Designation of the Employee : " << s[i].desig << endl;
      cout << "Salary of the Employee : " << s[i].salary << endl;
    }

    return 0;
}
