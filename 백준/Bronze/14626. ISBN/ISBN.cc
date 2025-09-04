#include <iostream>
#include <string>

using namespace std;

int main() {
string isbn;
cin >> isbn;
int a=999;
int s,t = 0;

for (int i=0; i<13; i++) { //문자열을 사용해서 0부터 시작하니까 반대로 홀>*3 짝>그대로 바꿔줌
  if (isbn[i] == '*') {
    s = i;
    continue; //아래 계산 안 하고 넘어가야 함
  } else if (i%2==1) {
    t += (isbn[i]-'0')*3 ; //숫자로 바꿔줌 -'0'
  } else if (i%2==0) {
    t += (isbn[i]-'0');
  }
}

if (s % 2 == 1) {
    for (int i=0; i<10; i+=3) { //0 3 6 9는 그냥 넣으면 됨
      if ((10 - t % 10) % 10 == i) {
        a = i;
      }
    }
    
    if (a==999) { //위 반복문을 그냥 빠져나왔다면 = 0369가 아니라면
      for (int i=12; i<28; i+=3) { //이후 12 15 ...는 a에 두자리수로 넣어줘야 함
        if ((10 - t % 10) % 10 == i%10) {
          a = i;    
        }
      }
    }
    a = a/3; //*x3에서 *값 구하기
} else { //홀수 자리일 때 계산
    a = (10 - t % 10) % 10; //10 - t % 10; >> 이러면 t%10 값이 0일 때 틀림
}
  cout << a;
}