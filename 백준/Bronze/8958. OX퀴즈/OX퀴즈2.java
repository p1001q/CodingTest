import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        for (int i = 0; i < n; i++) {
            String s = br.readLine();  // OX 문자열 입력
            int[] scores = new int[s.length()];
            int sum = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    scores[j] = (j == 0) ? 1 : scores[j - 1] + 1; // 연속 O 점수
                } else {
                    scores[j] = 0; // X면 점수 0
                }
                sum += scores[j]; // 합산
            }

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
