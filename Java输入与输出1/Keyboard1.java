package Java输入与输出1;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
public class Keyboard1 {
    public static void main(String[] args)throws Exception {
     //   System.out.println("输入一个字符，Enter结束");
     //   int r=System.in.read();
    //   System.out.println("输入的字符为"+(char)r);
        //输入一行
        System.out.println("输入一行字符，Enter结束");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);//键盘输入流

        FileWriter fw=new FileWriter("d:\\abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);//文件输入流
        System.out.println("请输入内容（EOF)结束：");
        String data;
        while(true){
            data=br.readLine();//从键盘读取一行数据，存入data
            if(data.equals("eof")) break;//输入结束
            bw.write(data);//data存入文件
            bw.newLine();
        }
        bw.close();
        System.out.println("文件创建完毕");
      //  String r1=br.readLine();
      //  System.out.println("输入的字符串为："+r1);
    }
}
