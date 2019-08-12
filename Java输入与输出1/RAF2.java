package Java输入与输出1;
import java.io.*;
public class RAF2 {
    public static void main(String[] args)throws Exception {
        File f=new File("d:\\raf.txt");
        RandomAccessFile raf=new RandomAccessFile(f,"rw");
        String s="弘吉";
        System.out.println("在文件末尾加数据");
        long len=raf.length();//获取文件长度
        raf.seek(len);//将文件指针移至文件末尾
        raf.writeUTF(s);//存储数据;
        System.out.println("读取刚存入地数据");
        raf.seek(len);
        System.out.println(raf.readUTF());
        System.out.println("读取第一个数据");
        raf.seek(0);
        System.out.println(raf.readInt());
        raf.close();
    }
}
