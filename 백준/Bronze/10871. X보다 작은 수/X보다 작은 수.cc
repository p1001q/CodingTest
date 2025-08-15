#include <iostream>
using namespace std;

int main() {
int n, x, m;
cin >> n >> x;

for (int i=0; i<n; i++) {
    cin >> m;
    if (m<x) {
        cout << m << " ";
    }
}

}
//정수 개수 N, X(보다 작은 수 모두 출력), 수열 A
//개수를 알려주는 이유? 반복문 횟수로 활용
//반복문으로 X보다 작으면 출력
//cin이 알아서 공백 구분해서 받는 줄 모르고 배열에 담으려고 했었음