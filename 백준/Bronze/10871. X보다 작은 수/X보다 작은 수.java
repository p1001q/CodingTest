import java.io.*;
import java.util.*; //토큰화 사용하기 위함, 두 개는 기본 템플릿으로 기억하기

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
            ?? readLine은 한 줄 읽는 거일텐데 n이랑 x 어케 나눠 담지?
            >> 1. StringTokenizer 2. split()
        */

        StringTokenizer st = new StringTokenizer(br.readLine()); //첫 번째 줄
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            //공백 기준으로 하나씩 읽고 비교해야되는데 한줄 읽어서 토큰화해서 비교해야되나?
            int m = Integer.parseInt(stA.nextToken());
            if (m<x) {
                bw.write(m + " "); 
                //주의! m(정수) + ' '(유니코드값 32) 
                //>> 둘 다 정수로 인식돼서 값을 더해버림 (3+32=35, 유니코드값 35번인 %가 출력됨)
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}