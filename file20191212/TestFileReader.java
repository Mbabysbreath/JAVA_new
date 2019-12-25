package file20191212;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ZhaoMin
 * @date 2019/12/25 22:50
 */
public class TestFileReader {
    /**
     * 将文件内容从hello.txt中读取到hello2.txt中
     */
    @Test
    public void fileReader(){
        FileReader fr= null;
        FileWriter fw= null;
        try {
            //1.指明要读取和写出的文件
            File srcFile=new File("hello.txt");
            File desFile=new File("hello2.txt");
            //2.创建输入流对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(desFile);
            //3.数据的读入
            char[] cbuf=new char[5];
            int len;
            while((len=fr.read(cbuf))!=-1){
                String s=new String(cbuf,0,len);
                fw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
