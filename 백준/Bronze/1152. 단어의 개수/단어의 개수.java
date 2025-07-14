import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력 스트림 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //문자열 한 줄 입력받기
        String input = br.readLine();
        
        //공백을 기준으로 단어 분리
        StringTokenizer st = new StringTokenizer(input);
        
        //토큰 개수 = 단어 개수 출력
        System.out.println(st.countTokens());
    }
}