package AWT;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ZhaoMin
 * @date 2019/10/30 8:54
 */
class Layout extends Frame{
    public Layout(String title) {
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        //创建布局约束条件
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill=GridBagConstraints.BOTH;
        constraints.weightx=1;
        constraints.weighty=1;
        this.addComponent("btn1",layout,constraints);
        this.addComponent("btn2",layout,constraints);
        this.addComponent("btn3",layout,constraints);

        constraints.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("btn4",layout,constraints);

        constraints.weightx=0;
        constraints.weighty=0;
        addComponent("btn5",layout,constraints);

        constraints.gridwidth=1;
        this.addComponent("btn6",layout,constraints);

        constraints.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("btn7",layout,constraints);

        constraints.gridheight=2;
        constraints.gridwidth=1;
        constraints.weighty=2;
        constraints.weightx=2;
        this.addComponent("btn8",layout,constraints);

        constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridheight=1;
        this.addComponent("btn9",layout,constraints);
        this.addComponent("btn10",layout,constraints);

        this.pack();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Window window=(Window)e.getComponent();
                window.dispose();
            }
        });
    }
    private void addComponent(String name, GridBagLayout layout,GridBagConstraints c){
        Button bt=new Button(name);
        layout.setConstraints(bt,c);//建立对象和组件连接
        this.add(bt);
    }

        }
public class GridBagLayout1 {
    public static void main(String[] args) {
        int a=1;int b=1;
        System.out.println(a+b);
       new Layout("GridBagLayout");
    }

}
