package API_2;
/**
 * HashSet类实现Set接口
 * 向HashSet中添加元素,
 * 不允许有重复元素存在
 */

import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet hset=new HashSet();
        System.out.println("添加三个元素：");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
       String a=s.nextLine();
       String str=s.nextLine();

        hset.add(num);
        hset.add(num);
        hset.add(str);
        System.out.print("元素个数："+hset.size());
        System.out.print("删除元素:");
        int rnum=s.nextInt();
        hset.remove(rnum);
        System.out.print("元素个数："+hset.size());
    }
}
