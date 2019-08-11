package Java输入与输出1;
import java.io.*;
public class File10 {
    public static void main(String[] args)throws Exception {
        FileReader fr=new FileReader("d:\\aiphabet.txt");
        BufferedReader br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
            System.out.println(s);
        br.close();
    }
}
