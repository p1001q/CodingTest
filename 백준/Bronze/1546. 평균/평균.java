import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입출력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //과목 개수 입력
        int n = Integer.parseInt(br.readLine());

        //점수 입력 및 최대값 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) max = scores[i];
        }

        //점수를 변환하며 합계 계산
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) scores[i] / max * 100;
        }

        //평균 계산
        double avg = sum / n;

        //결과 출력
        bw.write(avg + "\n");
        bw.flush();
        bw.close();
    }
}