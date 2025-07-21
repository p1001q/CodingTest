import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //테스트 케이스 개수

        for (int i = 0; i < n; i++) {
            String s = br.readLine();  //OX 문자열 입력
            int count = 0; //연속된 O의 개수
            int sum = 0;   //점수 합계

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') { //문자가 O면
                    count++;      //연속 카운트 증가
                    sum += count; //해당 점수 합산
                } else {          //문자가 X면
                    count = 0;    //연속 끊김
                }
            }
            bw.write(sum + "\n"); //점수 출력
        }

        bw.flush();
        bw.close();
    }
}