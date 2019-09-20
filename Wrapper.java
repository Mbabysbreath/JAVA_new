
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
public class Wrapper {
    public static void main(String[] args) {
       int a=7;
        String b="123";
        Integer w1=new Integer(a);
        Integer w2=new Integer(b);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.byteValue());
        System.out.println(w1.parseInt("12"));
        int c=Integer.parseInt("123",8);
        System.out.println(c);
        System.out.println(Integer.toBinaryString(-1));
        
      float f = 3.14f;
      System.out.println("将浮点数3.14转为字符串");
      //1.调用String类的valueOf()
      String str1 = String.valueOf(f);
      //2.将float装箱为对象，调用Float对象的toString()方法
      Float ft = f;
      String str2 = Float.toString(ft);
      System.out.println(str1);
      System.out.println(str2);
      System.out.println("把字符串 “3.14” 转换为 浮点数 3.14");
      String str = "3.14";
      //调用Float的parseFloat()
      float f2 = Float.parseFloat(str);
      System.out.println(f2);
      System.out.println("字符串拼接：");
      String name = "赵敏";
      String cardNum = "73730";
      int age = 18;
      String sentence = "%d的%s的一卡通卡号是%s%n\r\n";
      System.out.println("1:使用printf格式化输出：");
      System.out.printf(sentence, age, name, cardNum);
      System.out.println("2.使用format格式化输出：");
      System.out.format(sentence, age, name, cardNum);
      System.out.println("其他常用格式化方式：");
      int year = 2019;
      int month = 9;
      System.out.format("%8d%n", year);//总长度为8,右对齐
      System.out.printf("%8d%n", month);
      System.out.format("%-8d%n", year);//左对齐
      System.out.printf("%08d%n", year);//总长度为8，不够补0
      System.out.format("%,8d%n", year * 100000);//千位分隔符
      System.out.println("每个单词首字母大写：");
      String sentence1 = "i love you three thousand times";
      String[] part = sentence1.split(" ");

      String[] newstr=new String[part.length];
      for (int i=0;i<part.length;i++) {
          char[] partString=part[i].toCharArray();
          String chBig=part[i].toUpperCase();
          char[] partBig=chBig.toCharArray();
          newstr[i]=part[i].replace(partString[0],partBig[0]);
          System.out.println(newstr[i]);
      }
      //  System.out.println(Arrays.toString(part));
    String group=String.join(" ",newstr);
        System.out.println(group);

        System.out.println("字符串比较");
        String str3="light now";
        String str4=new String(str3);
        String str5="light";
        if(str3==str4){
            System.out.println("是同一个对象true");
            if(str3.equals(str4)){
                System.out.println("内容相同");
            }
        }else{
            System.out.println("不是同一个对象false");
            if(str3.equals(str4)){
                System.out.println("但内容相同");
            }
        }
        if(str3==str5){
            System.out.println("是同一个对象true");
        }else{
            System.out.println("f不是同一个对象alse");
        }
        System.out.println(str3.startsWith("light"));
//java日期类
        System.out.println("java日期类");
        Date date1=new Date();
        System.out.println("当前时间1：" + date1.toString());//从1970年1月1日 8：00开始计算
        System.out.println("当前时间2：" + date1);
        System.out.println("当前时间getTime()"+date1.getTime());
        Date zeroTime=new Date(0);//用0做构造时间
        System.out.println("用0做构造方法得到的时间："+zeroTime);
        System.out.println();
        Date date2=new Date(5000);
        System.out.println("从1970年月1日8：00开始，经历了5秒： "+date2);
        //simpleDateformat类，日期格式化
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        System.out.println("SimpleDateformat日期格式化(日期转字符串)：");
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3=new Date();
        String str6=sd.format(date3);
        System.out.println("当前日期通过sdf的格式："+str6);
        System.out.println("SimpleDateformat日期格式化(字符串转日期)：");
        String str7="2019-09-08 14:37:07";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            Date date4=sdf1.parse(str7);
            System.out.printf("字符串%s通过yyyy-MM-dd HH:mm:ss%n转化为日期对象%s%n",str7,date4.toString());
        }catch (ParseException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
