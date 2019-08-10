import java.io.*;
public class File7 {
    public static void main(String[] args)throws Exception {
        File f=new File("d:\\个人信息.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("宋继洋");
        dos.writeInt(22);
        dos.writeInt(181);
        dos.close();
        System.out.println("文件创建完毕");
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String name;int age,height;
        name=dis.readUTF();
        age=dis.readInt();
        height=dis.readInt();
        dis.close();
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("身高："+height);
    }
}
