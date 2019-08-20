import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("weiying"));
        System.out.println(map.getOrDefault("魏婴","魏无羡"));
        map.put("姓名：","魏无羡");
        map.put("住址1：","莲花圬");
        map.put("住址2：","云深不知处");
        map.put("宠物：","小苹果");
      //  System.out.println(map.getOrDefault("莲花圬","云深不知处"));
        System.out.println(map.get("住址："));
        System.out.println(map.get("宠物："));
        System.out.println(map.containsKey("住址："));
        System.out.println(map.containsValue("莲花圬"));
        System.out.println(map.containsValue("云深不知处"));
        for(Map.Entry<String,String> entry1:map.entrySet()){
            System.out.println(entry1.getKey()+entry1.getValue());
        }
    }
}
