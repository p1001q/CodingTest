import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {        
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a+b)+"\n"); //정수랑 문자열 혼합 출력
        }

        bw.flush();
        bw.close();
        br.close(); //왜 이거 안 적어주면 콘솔창에 안 보이냐

        /*
        bw.flush(); 버퍼에 모인 출력 내용을 강제로 내보냄
        bw.close(); flush() 한 뒤 스트림을 닫아 자원 해제 //close안에 flush있음
        br.close(); 입력 스트림 닫고 자원 해제 (출력엔 영향 없음)
        */
    }
}