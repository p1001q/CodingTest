import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자열 정수열로 변환
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) arr[i] = Integer.parseInt(st.nextToken());

        //1로 시작한다면 ascending 검증
        if (arr[0] == 1) {
            for (int i = 0; i < 8; i++) {
                if (arr[i] != i + 1) {
                    bw.write("mixed\n");
                    break;
                }
                if (i == 7) bw.write("ascending\n");
            }
        }
        
        //1말고 8로 시작한다면 descending 검증
        else if (arr[0] == 8) {
            for (int i = 0; i < 8; i++) {
                if (arr[i] != 8 - i) {
                    bw.write("mixed\n");
                    break;
                }
                if (i == 7) bw.write("descending\n");
            }
        } 
        
        //다른 숫자로 시작한다면 mixed
        else {
            bw.write("mixed\n");
        }

        bw.flush();
        bw.close();
    }
}