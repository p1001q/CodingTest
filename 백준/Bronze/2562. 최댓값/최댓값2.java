import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //입출력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;          //최댓값
        int maxIndex = 0;     //최댓값의 위치 (0부터 시작)

        //크기 고정이라 리스트 안 써도 됨
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
          arr[i] = Integer.parseInt(br.readLine());
          if (arr[i] > max) {
            max = arr[i];
            maxIndex = i;
          }
        }

        //결과 출력
        bw.write(max + "\n");           //최댓값
        bw.write((maxIndex + 1) + "\n"); //1-based 인덱스로 변환해서 위치 출력
        bw.flush();
        bw.close();
    }
}
