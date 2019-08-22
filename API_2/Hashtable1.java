package API_2;
import java.util.*;
/**
 * 使用实现了Map接口的Hashtable类
 *将电话号码作为一个人的key值
 */
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        //添加指定的key与元素
        ht.put("18292415224","赵敏");
        ht.put("12345678910","haha");
        ht.put("09879210302","呼呼");
        //若拥有指定key的元素存在，则删除
        if(ht.containsKey("12345678910")){
            ht.remove("12345678910");
        }
        //输出元素个数
        System.out.println("元素个数:"+ht.size());
        //输出所有元素
        for(Enumeration e=ht.elements();e.hasMoreElements();){
            System.out.println(e.nextElement());
        }
    }
}