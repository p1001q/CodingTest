#include <iostream>
using namespace std;

int main() {
char s[1001]; //문자열 저장해놓을 배열 (최대크기 1000)
int n;
cin >> s; //문자열 입력받음
cin >> n; //순서 입력받음
cout << s[n-1]; //문자열 n번째 출력
}
//막힌 부분: 크기 선언 필요 없지 않나?? c++ 문자열 있지않나? 일단 제출해보기
