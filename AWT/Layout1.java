package AWT;
import java.awt.*;
//创建5个按钮
public class Layout1 {
    public static void main(String[] args) {
        Frame f=new Frame("BorderLayout");
        f.setSize(200,100);
       Button be=new Button("East");
       Button bw=new Button("West");
       Button bs=new Button("South");
       Button bn=new Button("North");
       Button bc=new Button("Center");
       f.add(be,BorderLayout.EAST);
       f.add(bw,BorderLayout.WEST);
       f.add(bs,"South");
       f.add(bn,"North");
       f.add(bc,BorderLayout.CENTER);
        f.setVisible(true);
    }
}
