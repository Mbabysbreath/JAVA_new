package AWT;

/**
 * @autor ZhaoMin
 * @date 2019/8/24 22:20
 */
import java.awt.*;
public class Layout3 {
    public static void main(String[] args) {
        Frame f=new Frame("改变Layout");
        //不应用任何布局
        f.setLayout(null);
        Button b1=new Button("No");
        Button b2=new Button("Yes");
        //必须自行设定组件的大小和位置
        b1.setBounds(20,50,100,40);
        b2.setBounds(50,100,100,40);
        f.add(b1);
        f.add(b2);
        f.setSize(200,160);
        f.setVisible(true);
    }
}
