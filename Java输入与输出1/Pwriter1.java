import java.io.*;
public class Pwriter1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out,true);

        String s;
        pw.println("请输出字符");
        while(!(s=br.readLine()).equals(""))
            pw.println(s);
        br.close();
        pw.close();
    }
}
