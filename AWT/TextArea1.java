package AWT;

/**
 * @author ZhaoMin
 * @date 2019/8/26 23:11
 * 从文件中读取数据，
 * 并显示在TextArea中
 */
import java.awt.*;
import java.io.*;
public class TextArea1 {
    public static void main(String[] args) throws IOException {
            Frame frame=new Frame("查看文件");
            TextArea ta=new TextArea(20,50);//显示文件内容的TextArea
            String aline;//保存从文件中读取的数据
        FileReader fr=new FileReader("d:\\Java_HP\\src\\AWT\\TextArea1.java");//将字符写入文件
        BufferedReader br=new BufferedReader(fr);//每次从文件读取一行数据
        while((aline=br.readLine())!=null){
            ta.append(aline+'\n');//每读取一行，将aline中的的数据追加到ta尾部
        }
        br.close();
        frame.add(ta);
        frame.pack();
        frame.setVisible(true);
    }
}
