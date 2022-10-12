#include <iostream>

using namespace std;
class test
{
    int a,b;
public:
    void get(int a,int b)
    {
        this->a=a;
        this->b=b;
    }
    void display()
    {
        cout<<"a= "<<a<<endl<<"b= "<<b;
    }
};

int main()
{
    test t;
    t.get(10,20);
    t.display();
    return 0;
}
