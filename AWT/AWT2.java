package AWT;
import java.awt.*;
/**
 * 向容器中添加组件按钮
 */
public class AWT2 {
    public static void main(String[] args) {
        Frame f=new Frame("Window和Panel");
        Button b1=new Button("OK");
        Button b2=new Button("Cancel");
        Panel p=new Panel();//创建面板p
        p.setBackground(new Color(130,55,83));//设置背景色为淡红
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.setSize(200,100);
     //   f.setLocation(200,200);
        f.setVisible(true);
    }
}
