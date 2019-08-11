import java.io.*;
public class File9 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("d://char.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("你好");
        bw.newLine();
        bw.write("很高兴");
        bw.newLine();
        bw.close();
        FileInputStream fis=new FileInputStream("d://char.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
    }
}
