package Java输入与输出1;
import java.io.*;
public class File8 {
    public static void main(String[] args)throws Exception {
        //Character Output Stream
        FileOutputStream fos=new FileOutputStream("d:\\char.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        osw.write('易');
        osw.write('安');
        osw.close();
        //Chacater Input Stream
        FileInputStream fis=new FileInputStream("d://char.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        System.out.println((char)isr.read());
        System.out.println((char)isr.read());
    }
}
