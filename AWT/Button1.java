package AWT;

/**
 * @autor ZhaoMin
 * @date 2019/8/25 0:04
 */
import java.awt.*;
import java.awt.event.*;
public class Button1 implements ActionListener {
    Frame f=new Frame("Button");
    Button button = new Button("Add");
    int count=0;//记录按钮点击次数
    Label lab=new Label("0");//显示按钮点击次数
    public Button1(){//构造函数
        button.addActionListener(this);//注册动作事件监听器
        f.add(button,"Center");
        f.add(lab,"South");
        f.pack();
        f.setVisible(true);
    }
    //点击按钮时被调用
    public void actionPerformed(ActionEvent ae){
        count++;
        lab.setText(String.valueOf(count));//显示按钮点击次数
        //String valueOf(int i),返回i的字符串形式
    }

    public static void main(String[] args) {
        Button1 but1=new Button1();
    }
}
