import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7" + "\n");
        bw.write("r`-_   ,'  ,/" + "\n");
        bw.write(" \\. \". L_r'" + "\n");
        bw.write("   `~\\/" + "\n");
        bw.write("      |" + "\n");
        bw.write("      |" + "\n");

        bw.close();
    }

}//' 앞에 \ 안 써줘도 됨 문자열 안에서 문자 취급 됨 (c++로 풀 땐 붙였음)