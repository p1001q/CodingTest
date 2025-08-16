import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //bw.write(a*b); >>이러니까 유니코드 값에 해당하는 문자가 출력됨
        //write(int) >> 값에 해당하는 문자 하나를 출력하기 때문...

        //bw.write(a*b + " ");               //" " > 문자 인식해서 int → 문자열 자동 변환, write(String) 호출
        //bw.write(Integer.toString(a * b)); // Integer.toString()으로 int → 문자열, write(String) 호출
        bw.write(String.valueOf(a * b));     // String.valueOf()으로 int → 문자열, write(String) 호출

        //정수 → 문자열: Integer.toString(int)
        //뭐든 → 문자열: String.valueOf(...) > 내부에서 Integer.toString(int) 호출 함

        bw.close();
        br.close();
    } 
}