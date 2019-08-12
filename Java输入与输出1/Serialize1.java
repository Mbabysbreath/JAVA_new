package Java输入与输出1;
import java.io.*;
class Man implements Serializable{//Man类对象可以序列化
    String name;
    int age;
    double height;
}
public class Serialize1 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("d:\\obj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Man m=new Man();
        m.name="王一博";
        m.age=22;
        m.height=179;
        oos.writeObject(m);//将对象写入流
        oos.close();
        System.out.println("已将对象输出至文件");
        FileInputStream fis=new FileInputStream("d:\\obj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Man n;
        n=(Man)ois.readObject();
        ois.close();
        System.out.println(n.name);
        System.out.println(n.age);
        System.out.println(n.height);
    }
}
