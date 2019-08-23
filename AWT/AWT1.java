package AWT;
import java.awt.*;
public class AWT1 {
    public static void main(String[] args) {
        Frame f=new Frame("Thinking Java");//创建框架窗口f
        f.setSize(200,100);//设定窗口f的大小
        f.setLocation(10,10);
        f.setVisible(true);//显示框架窗口
        //f.setVisible(false);
    }
}
