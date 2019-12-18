package dataType20191204;

/**
 * @author ZhaoMin
 * @date 2019/12/4 10:47
 */
public class VariableTest2 {
    public static void main(String[] args) {
        //1、编码情况1:long没有加l,默认为int,自动提升为long
        long l=1231231;
        System.out.println(l);
        //编译失败：整数过大，要加l
        long l1=2133333333333311000l;
        System.out.println(l1);
        //******float一定要加f,不加默认为double
        float f1=12.3f;

        //2.编码情况2:整型常量默认类型int;浮点型：默认double
        byte b=12;
       // byte b1=b+1;编译失败：相当于把int赋给byte
      //  float f1=12.3+b;编译失败：相当于把double 赋给float

    }
}
