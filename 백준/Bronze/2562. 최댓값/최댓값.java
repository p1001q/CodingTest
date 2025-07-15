import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //입출력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력값 저장할 리스트
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;          //최댓값
        int maxIndex = 0;     //최댓값의 위치 (0부터 시작)

        //9줄 입력 반복
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine()); //한 줄 입력 받고 정수 변환
            list.add(num);  //리스트에 추가

            //최댓값 비교
            if (num > max) {
                max = num;
                maxIndex = i;  //몇 번째 입력인지 저장 (0-based)
            }
        }

        //결과 출력
        bw.write(max + "\n");           //최댓값
        bw.write((maxIndex + 1) + "\n"); //1-based 인덱스로 변환해서 위치 출력
        bw.flush();
        bw.close();
    }
}