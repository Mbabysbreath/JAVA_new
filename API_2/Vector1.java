package API_2;
/**
 * 创建空的Vector对象，并添加并输出元素
 */
import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("Hello");
        v.addElement(1999);
        v.addElement(4.23);
        for(int i=0;i<v.size();i++){
            System.out.println(v.elementAt(i));
        }
        System.out.println(v.elements());

    }
}
