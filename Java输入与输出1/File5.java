import java.io.*;
public class File5 {
    public static void main(String[] args)throws Exception {
        File f = new File("d:\\aiphabet.txt");
        FileInputStream fis = new FileInputStream(f);
        char a;
        for (int i = 0; i < f.length(); i++) {//读取文件数据
            a = (char) fis.read();//read()方法每次读取一个字节，并将其转为int型，故须强制转为char型
            System.out.println(a);
        }
        fis.close();
    }
}
