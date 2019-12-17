package file20191212;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用：常用方法
 * （一）File类的重命名功能:
 * public boolan renameTo(File dest):把文件重命名为指定的文件路径
 * 比如：file1.renameTo(fiel2)为例：
 *
 * @author ZhaoMin
 * @date 2019/12/12 13:28
 */
public class FileTest2 {
    @Test
    public void test1(){
        File file1=new File("hello.txt");
        File file2=new File("D:\\Java_HP\\io\\hi.txt");
        boolean renameTo=file1.renameTo(file2);
        System.out.println(renameTo);

    }
}
