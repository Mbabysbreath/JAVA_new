import java.io.*;
public class File6 {
    public static void main(String[] args)throws Exception {
        File f=new File("d:\\大写字母.txt");//x1创建文件对象f
        FileOutputStream fos=new FileOutputStream(f);//x2创建FileOutputStream对象fos,向文件写入字节数据
        FilterOutputStream filter=new FilterOutputStream(fos);//x3 创建FilterOutputStream对象filter，向fos对象传入数据
        for(int i='A';i<'Z';i++){
            filter.write(i);//将数据送入filter对象
        }
        filter.close();
    }
}

