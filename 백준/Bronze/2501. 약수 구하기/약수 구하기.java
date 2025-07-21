import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 약수를 구할 수
        int K = Integer.parseInt(st.nextToken());  // K번째 약수

        int count = 0;  // 약수 개수 카운트
        int result = 0; // K번째 약수

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { //i가 약수라면
                count++;
                if (count == K) {
                    result = i; //K번째 약수 저장
                    break;      //더 이상 탐색 필요 없음
                }
            }
        }

        if (result == 0) bw.write("0\n");
        else bw.write(result + "\n");

        bw.flush();
        bw.close();
    }
}
