package Java输入与输出1;
import java.io.*;
public class RAF1 {
    public static void main(String[] args)throws Exception {
        File f=new File("d:\\raf.txt");
        RandomAccessFile raf=new RandomAccessFile(f,"rw");
        int a=10;
        double b=12.34;
        String c="abc";
        raf.writeInt(a);
        raf.writeDouble(b);
        raf.writeUTF(c);
        raf.close();
        System.out.println("文件创建完毕");
        RandomAccessFile raf1=new RandomAccessFile(f,"r");
       System.out.println("文件读取");
        System.out.println(raf1.readInt());
        System.out.println(raf1.readDouble());
        System.out.println(raf1.readUTF());
        raf1.close();
    }
}
