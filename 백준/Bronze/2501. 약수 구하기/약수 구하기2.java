import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //약수를 구할 값
        int K = Integer.parseInt(st.nextToken()); //K번째 약수

        ArrayList<Integer> divisors = new ArrayList<>();

        //N의 약수 찾기
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);  // 약수 저장
            }
        }

        //K번째 약수 출력 (없으면 0)
        if (K > divisors.size()) {
            bw.write("0\n");
        } else {
            bw.write(divisors.get(K - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
