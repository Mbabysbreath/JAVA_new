import java.io.*;
public class File1 {
    public static void main(String[] args) {
        File f=new File("d:\\abc.txt");
        if(f.exists()){
            System.out.println("文件已存在");
        }else{
            try{
                f.createNewFile();
                System.out.println("文件创建完毕");
            }catch(IOException e){
                System.out.println("文件创建失败");
            }
        }
        System.out.println(f.delete());
    }
}
