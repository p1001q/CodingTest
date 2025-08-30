#include <iostream>
using namespace std;

int main() {
    /*
    H 시 M 분 -45분 된 시간을 보여줘야 함
    10 47 > 10 45 /M이 45보다 크거나 같으면 그냥 계산한다
    10 10 > 9 25 /M이 45보다 작으면 H를 1 줄이고 60-45+M을 한다
            10-1 : 60-45+10
    0 30 > 23 45 /다른 건 다 괜찮은데 0-1이 23나오게 어떻게 하지?
    */
    int h,m;
    cin >> h >> m;

    if (m >= 45) {
        m=m-45;
    }
    else if(m < 45) {
        h=h-1;
        m=m+15;
        if (h==-1) {
            h=23;
        }
    }

    cout << h << ' ' << m;
}