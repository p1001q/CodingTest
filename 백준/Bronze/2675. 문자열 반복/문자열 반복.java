import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력 스트림 설정 (키보드 입력 받기)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력 스트림 설정 (버퍼에 모아서 출력)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 개수 입력 받기

        for (int t = 0; t < T; t++) {
            //각 줄에서 반복 횟수 R과 문자열 S 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); //반복 횟수
            String S = st.nextToken(); //입력 문자열

            StringBuilder sb = new StringBuilder(); //반복된 문자들을 담을 결과 문자열

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i); //문자열의 i번째 문자
                for (int r = 0; r < R; r++) {
                    sb.append(ch); //현재 문자를 R번 반복하여 추가
                }
            }

            bw.write(sb.toString()); //완성된 문자열 P 출력
            bw.newLine(); //줄바꿈
        }

        bw.flush(); //출력 버퍼 비우기
        bw.close(); //출력 스트림 닫기
    }
}
