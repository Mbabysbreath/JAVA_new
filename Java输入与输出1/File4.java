import java.io.*;
public class File4 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("d:\\aiphabet.txt",true);
        for(int i='a';i<='z';i++) {
            fos.write(i);//若向fos传送数据，fos会将其写入文件中
        }

            fos.close();//使用完毕，关闭文件输出流

    }
}
