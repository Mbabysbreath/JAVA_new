import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> collect = new ArrayList<>();
        System.out.println(collect.size());
        System.out.println( collect.isEmpty());
        collect.add("魔道祖师");
        collect.add("作者：墨香铜臭");
        System.out.println(collect.size());
        System.out.println(collect.isEmpty());
        Object[] ob=collect.toArray();
        Object ob1="dd";
        System.out.println(Arrays.toString(ob));
        System.out.println(collect.contains(ob1));
        collect.remove("魔道祖师");
        Object[] ob2=collect.toArray();
        System.out.println(Arrays.toString(ob2));
        collect.clear();
        Object[] ob3=collect.toArray();
        System.out.println(Arrays.toString(ob3));
    }
}
