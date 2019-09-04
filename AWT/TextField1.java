package AWT;
/**
 * @autor ZhaoMin
 * @date 2019/8/25 21:13
 * 使用标签、按钮、单行文本框，创建一个登录对话框
 */
import java.awt.*;
public class TextField1 {
    public static void main(String[] args) {
        Frame f=new Frame("登录对话框");
        //创建一个单行文本框，用于接受用户ID输入
        TextField id=new TextField(10);
        //创建一个单行文本框，用于结受用户密码输入
        TextField pw=new TextField(10);
        //登录按钮
        Button login=new Button("Login");
        //取消按钮
        Button cancel=new Button("Cancel");
        //指定密码显示字符为‘*’
        pw.setEchoChar('*');
        //指定布局管理器
        f.setLayout(new GridLayout(3,2));
        //向f中顺序添加组件
        f.add(new Label("ID",Label.CENTER));
        f.add(id);
        f.add(new Label("Password",Label.CENTER));
        f.add(pw);
        f.add(login);
        f.add(cancel);
        f.setSize(300,300);
        f.pack();
        f.setVisible(true);
    }
}
