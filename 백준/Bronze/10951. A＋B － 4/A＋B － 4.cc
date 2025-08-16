#include <iostream>
using namespace std;

int main() {
    int a, b;
    
    while (cin >> a >> b) {
        //cin >> a >> b; 조건식은 참,거짓 판별만 하는 줄 앎, 실행된다 생각 못 해 두 번 입력 받았었음
        cout << a+b << "\n";
    }
}
//헉 반복할 횟수를 모른다, 읽다가 공백일 때 알아서 멈춰야겠는데
//와일문으로 '읽을 데이터가 있다면' 조건을 어케 쓰지
//cin은 읽다가 더 읽을 거 없으면 false가 나온다네
//cin > 객체인데 조건식에 쓰면 자동으로 bool로 변환 됨 (istream 클래스의 변환 연산자로 인해?)