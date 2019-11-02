package AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ZhaoMin
 * @date 2019/10/30 8:45
 */
public class GridLayout {
    public static void main(String[] args) {
        Frame f=new Frame("GridLayout");
        java.awt.GridLayout gridLayout=new java.awt.GridLayout(3,3);
        f.setLayout(gridLayout);
        f.setSize(600,500);
        f.setLocation(300,500);

        for(int i=1;i<=9;i++){
            Button btn=new Button("btn"+i);
            f.add(btn);
        }
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window window=(Window)e.getComponent();
                window.dispose();
            }
        });
        f.setVisible(true);
    }
}
