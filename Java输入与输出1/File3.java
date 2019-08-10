import java.io.*;
public class File3 {
    public static void main(String[] args) {
        File f=new File("d:\\");
        File[] fs=f.listFiles();
       for(int i=0;i<fs.length;i++){
            if(fs[i].isDirectory()) {
                System.out.println("目录：");
                System.out.println(fs[i]);
            }
            else {
                System.out.println("文件：");
               System.out.println(fs[i]);
                System.out.print("大小："+fs[i].length()+"bytes"+" ");
                System.out.println("隐藏性："+fs[i].isHidden());
            }

        }
        File f1=new File("d:\\");
        String[] f1s=f1.list();
        for(int i=0;i<f1s.length;i++){
            System.out.println(f1s[i]);
        }
    }
}
