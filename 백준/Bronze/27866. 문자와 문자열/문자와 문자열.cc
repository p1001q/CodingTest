#include <iostream>
using namespace std;

int main() {
//문자열 저장해두고 입력받은 순번의 문자 출력하면 된다

//char s[1001]; //문자열 저장해놓을 배열 (최대크기 1000)
string s; //string 활용하면 크기 선언 필요 x
int n;
cin >> s; //문자열 입력받음
cin >> n; //순서 입력받음
cout << s[n-1]; //문자열 n번째 출력
}
//처음 막힌 부분: 크기 선언 필요 없지 않나?? c++ 문자열 있지않나? 일단 제출해보기
//char[]랑 string 쓰임새가 나눠져 있나? 아님 엔간하면 string 쓰나? 
//>>만들어져있는 거 써라
