#include <iostream>
using namespace std;

int main() {
    int a, b;
    
    while ((cin >> a >> b) && (a+b!=0)) {
        cout << a+b << "\n";
    }
}
//0 0 일 때 멈추면 됨