import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    byte num = (byte)br.readLine().charAt(0);
    System.out.println(num);
    }   
}

//방학 코테 첫 시작
//ㄹㅇ 무뇌 상태라 보면서 했다
//버퍼 리더는 뭐고 인풋스트림 리더는 뭐냐 
//그걸 왜 버퍼 리더에 넣은 거고 System.in은 어디서 나온거지
//CharAt(0)은 해당 문자열을 아스키 코드로 바꿔주는 함순가?
//readLine은 한 줄 읽는 거임?
//애초에 .의 의미가 뭐더라 맨 뒤부터 하는 거임?
//exception 안 넣으면 컴파일 에러 왜 뜨는 거임
//그전에 쟤 역할이 정확히 뭐더라?
//내가 알겠는 건 읽어와서 br에 넣고
//br에 있는 거 꺼내서 변환해서 num에 넣고
//그걸 출력한다는 것만 알겠음