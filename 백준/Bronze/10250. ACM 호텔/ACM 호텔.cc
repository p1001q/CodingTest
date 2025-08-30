#include <iostream>
#include <string>
using namespace std;

int main() {
  int t, h, w, n;
  cin >> t; //테스트케이스 입력

  for (int i=0; i<t; i++) {
    cin >> h >> w >> n;

    int x = n / h + 1;
    int y = n % h;
    if (y==0) { //딱 떨어진다면 최고층에 위치함
        x = x-1;
        y = h;
    }//n이 0부터 시작한다 보면 수식 더 간략화 가능
      //근데 내 뇌론 불가능 ㄱ ㅡ
 
     cout << y * 100 + x << "\n"; //출력 간략화
  }

}