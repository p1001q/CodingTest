import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) { //읽을 내용이 있다면 반복   
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a+b)+"\n");
        }
        
        bw.close();
        br.close();
    } 
    //널포인터익셉션 뜸, line 변수 사용 안 하고 바로 함수 사용했기 때문
    //그러면 조건식 함수, 블록 함수 총 2줄을 읽게 됨
    //마지막 줄은 null이 아니니까 조건식 실행
    //근데 블록 실행에선 마지막 줄 다음인 null을 받아옴 >> 토크나이저 함수 안에 null이 들어가게 돼서 에러남
}