package AWT;

/**
 * @autor ZhaoMin
 * @date 2019/8/24 23:02
 */
import java.awt.*;
public class Layout4 {
    public static void main(String[] args) {
        Frame f=new Frame("GridLayout");
        f.setLayout(new GridLayout(3,2));//分成3*2
        //添加按钮
        f.add(new Button("(1,1)"));
        f.add(new Button("(1,2)"));
        f.add(new Button("(2,1)"));
        f.add(new Button("(2,2)"));
        f.add(new Button("(3,1)"));
        f.add(new Button("(3,2)"));
        f.setSize(200,160);
        f.setVisible(true);
    }
}
