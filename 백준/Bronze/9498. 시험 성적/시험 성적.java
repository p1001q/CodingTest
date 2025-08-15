import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a >= 90 && a <= 100) {
            bw.write('A');     
        } else if (a >= 80 && a < 90) {
            bw.write('B');
        } else if (a >= 70 && a < 80) {
            bw.write('C');
        } else if (a >= 60 && a < 70) {
            bw.write('D');
        } else {
            bw.write('F');
        }

        bw.flush();
        bw.close();
        br.close();
    }
}