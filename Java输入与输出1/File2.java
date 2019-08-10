import  java.io.*;
public class File2 {
    public static void main(String[] args) {
        File f=new File("d:\\ZhaoMin.txt");
        if(f.exists()){
            System.out.println("文件存在");
        }else {
            try{
                f.createNewFile();
                System.out.println("文件已创建");
            }catch(IOException e){}
        }
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println("名称："+f.getName());
        System.out.println("目录："+f.getParent());
        System.out.println("路径："+f.getPath());
        System.out.println("文件大小："+f.length()+"bytes");
    }
}
