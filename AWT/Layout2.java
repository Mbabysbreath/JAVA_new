package AWT;

/**
 * @autor ZhaoMin
 * @date 2019/8/24 17:33
 */
import java.awt.*;
public class Layout2 {
    public static void main(String[] args) {
        Frame f=new Frame("使用Panel排列组件");
       Panel p=new Panel();
       f.setLayout(new FlowLayout());
        f.add(new Button("North"),"North");
        f.add(new Button("West"),"West");
        f.add(new Button("Center"),"Center");
        f.add(new Button("East"),"East");
        //向面板添加5个按钮，使用面板可以使遵循BorderLayout布局的Frame可以容纳6个以上的组件
        p.add(new Button("1"));
        p.add(new Button("2"));
        p.add(new Button("3"));
       f.add(p);//将面板添加到框架窗口f中
        f.pack();//自动调整Frame的大小，使其得以显示其中所有的组件
        f.setVisible(true);
    }
}
