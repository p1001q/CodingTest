import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //ascending 체크
        boolean isAscending = true;
        for (int i = 0; i < 8; i++) {
            if (arr[i] != i + 1) {
                isAscending = false;
                break;
            }
        }

        //descending 체크
        boolean isDescending = true;
        for (int i = 0; i < 8; i++) {
            if (arr[i] != 8 - i) {
                isDescending = false;
                break;
            }
        }

        if (isAscending) {
            bw.write("ascending\n");
        } else if (isDescending) {
            bw.write("descending\n");
        } else {
            bw.write("mixed\n");
        }

        bw.flush();
        bw.close();
    }
}
