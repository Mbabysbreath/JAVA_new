package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//创建5个按钮
public class FlowLayout1 {
    public static void main(String[] args) {
        //流式布局管理器
        Frame f=new Frame("FloaLayout");
       f.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
        f.setSize(200,100);
        f.setLocation(300,200);
        f.setVisible(true);
        Button but1=new Button("第1个按钮");
        f.add(but1);
        //匿名内部类
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window w=(Window)e.getComponent();
                w.dispose();
            }
        });
        but1.addActionListener(new ActionListener() {
            private int num=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                f.add(new Button("第"+ ++num+"个按钮"));
                f.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
