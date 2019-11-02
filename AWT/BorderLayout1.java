package AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ZhaoMin
 * @date 2019/10/30 8:34
 */
public class BorderLayout1 {
    public static void main(String[] args){
        Frame f=new Frame();
        f.setSize(500,500);
        f.setLocation(300,300);
        f.setLayout(new BorderLayout());
        f.setVisible(true);

        Button but1 = new Button("East");
        Button but2 = new Button("West");
        Button but3 = new Button("South");
        Button but4 = new Button("North");
        Button but5 = new Button("Center");

        f.add(but1,BorderLayout.EAST);
        f.add(but2,BorderLayout.WEST);
        f.add(but3,BorderLayout.SOUTH);
        f.add(but4,BorderLayout.NORTH);
        f.add(but5,BorderLayout.CENTER);

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
