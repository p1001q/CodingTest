#include <iostream> //암묵적으로 #include <string>가 포함됨
#include <string> //근데 변환 함수 쓸 땐 불러줘야 함
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    
    //1. 수 계산
    cout << a+b-c << "\n";
    
    //2. 문자 계산 /더하기, 숫자 문자로 바꿔서 붙인 후 저장
    /*
    정수형 변수 a를 문자로 바꾸는 함수가 뭐지?
    >> to_string()
    %d해서 변수 넣는 거 있지 않았나? '%d' + '%d' - '%d', a b c 이런 식으로?  
    >>printf 포맷팅 기능임 cout에선 XX
    */
    string ab = to_string(a) + to_string(b);
    
    //빼기, 문자 다시 숫자로 바꿔서 계산 후 저장
    //문자열을 숫자로 바꾸는 함수는 뭐임?
    //>> stoi()
    int n = stoi(ab) - c;

    //출력
    cout << n;
}