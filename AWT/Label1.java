package AWT;

/**
 * @autor ZhaoMin
 * @date 2019/8/24 23:36
 */
import java.awt.*;
public class Label1 {
    public static void main(String[] args) {
        Frame f=new Frame("Label");
        Label lab1=new Label("Label 1");//创建标签，文本默认左对齐
        Label lab2=new Label("Label 2",Label.RIGHT);//设定右对齐
        Label lab3=new Label("",Label.CENTER);//创建空标签，为其设定文本时居中
        lab3.setText(lab1.getText()+lab2.getText());//将lab3的标签文本设为1和2 的连接
        f.add(lab1,"North");
        f.add(lab2,"Center");
        f.add(lab3,"South");
        f.setSize(200,100);
        f.setVisible(true);
    }
}
