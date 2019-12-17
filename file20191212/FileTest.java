package file20191212;

import org.junit.Test;

import java.io.File;

/**
 * 1.File类的一个对象，代表一个文件或一个文件目录（文件夹）
 * 2.File类声明在java.io包下
 * @author ZhaoMin
 * @date 2019/12/12 11:32
 */
public class FileTest {
    /*
   1. 如何创建File类的实例
        File(String filePath)
        File(String parent,String child)//指明上一层目录，和即将创建的文件或目录
         File(File parent,String child)//在文件类型下
   2.相对路径：相较于某个路径下，指明的路径
      绝对路径：包含盘符在内的文件或文件目录

   3.路径分隔符
    windows:\\
    unix:/
     */
    @Test
    public void test1() {
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module/项目
        System.out.println(file1);
        //构造器2 D:\Java_HP\test1
        File file2=new File("D:\\Java_HP","test1");//test1文件夹的上一层目录是D:\Java_HP
        System.out.println(file2);

        //构造器3 D:\Java_HP\test1\hi.txt
        File file3=new File(file2,"hi.txt");//hi.txt文件在fiel2的目录下即test1
        System.out.println(file3);
    }

}
