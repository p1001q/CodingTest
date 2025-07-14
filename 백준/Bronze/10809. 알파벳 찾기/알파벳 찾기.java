import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력용 버퍼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력용 버퍼
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();  //문자열 입력

        int[] pos = new int[26];   //알파벳 a~z의 위치 저장 배열

        //모든 위치를 -1로 초기화
        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        //문자열 탐색하면서 처음 등장 위치 기록
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';  //'a' ~ 'z' → 0 ~ 25
            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        //결과 출력
        for (int i = 0; i < 26; i++) {
            bw.write(pos[i] + " ");
        }

        bw.newLine();  //줄바꿈
        bw.flush();    //버퍼 비우기 (중요!)
        bw.close();    //리소스 정리
    }
}
