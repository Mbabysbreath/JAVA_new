package file20191212;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**File类的使用：常用方法
 * （一）File类的获取功能:
 *
 * (1)public String getAbsolutePath():获取绝对路径
 * （2）public String getPath():获取路径
 * （3）public String getName():获取名称
 * （4）public String getParent():获取上层文件目录路径，若无，反回null
 * (5)public long length():获取文件长度（字节数），不能获取目录长度
 * （6）public long lastModeified():获取最后一次修改的时间，毫秒
 * //如下两个方法适用于文件目录
 * （7）public String[] list():获取指定目录下的所有文件或者文件目录的名称数组
 * （8）public File[] listFiles():获取只指定目录下所有文件或者文件目录的File数组
 * @author ZhaoMin
 * @date 2019/12/12 13:04
 */
public class FileTest1 {
    @Test
    public void test(){
        File file1=new File("hello.txt");
        File file2=new File("D:\\Java_HP\\io\\hi.txt");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }
    @Test
    public void test3(){
        File file=new File("D:\\Java_HP");
        String[] list=file.list();
        for(String s:list){
            System.out.println(s);
        }

        File[] files=file.listFiles();
        for(File f:files){
            System.out.println(f);
        }
    }
}
