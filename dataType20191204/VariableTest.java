package dataType20191204;

/**
 * 类型转换的问题
 * 1.自动类型提升：
 *   容量：指的是数的表示范围的大小，不是占据内存空间的大小
 *   当容量小的数据类型变量和容量大的数据类型变量做运算时，结果自动提升为容量大的数据类型
 *   byte、char、short-->int-->long-->float-->double
 *      （1）int=byte+int;//byte是一个字节，int是4个，用byte接收，可能会导致int中其他位的数据丢失
 *      （2）float=long+float;
 *      （3）int=short+char;int=byte+char
 *    说明：当byte\short\char三种类型的变量做运算（包括自身）时，结果为int类型
 *    java在做运算时，如果操作数均在int范围内，那么一律在int的空间内运算
 * 2.强制类型转换：见VariableTest1.java文件
 * @author ZhaoMin
 * @date 2019/12/4 10:06
 */

 class VariableTest {
    public static void main(String[] args) {
        byte b1=2;
        int i1=129;
        //用byte接收：编译错误： 不兼容的类型: 从int转换到byte可能会有损失
       // byte b2=b1+i1;

        //用int、long接收:编译通过 131
        int i2=b1+i1;
        System.out.println(i2);

        //用float接收:编译通过 131.0
        float f=b1+i1;
        System.out.println(f);

        //将short赋给double:编译通过 123.0
        short s=123;
        double d=s;
        System.out.println(d);

        //char+int=int
        char c1='a';
        int i3=10;
        int i4=c1+i3;
        short s1=13;
        //short s2=c1+s1; 编译不通过：应该用int接收
       // char c2=c1+s1;编译不通过：应该用int接收
        System.out.println(i4);

    }
}
