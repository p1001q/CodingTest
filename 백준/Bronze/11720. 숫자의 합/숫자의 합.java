import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());       // 숫자 개수 읽기
        String numbers = br.readLine();                // 숫자 문자열 읽기

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';           // 문자 → 숫자 변환
        }

        bw.write(String.valueOf(sum));                // 결과 출력
        bw.newLine();                                 // 줄바꿈
        bw.flush();                                   // 출력 버퍼 비우기 (실제로 출력됨)
        bw.close();                                   // 리소스 정리
    }
}