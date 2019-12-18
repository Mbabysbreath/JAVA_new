package dataType20191204;

/**
 * 2.强制类型转换：自动类型提升运算的逆运算
 *  （1）需要使用强转符（）
 *  （2）强制类型转换。可能会导致精度损失
 *  byte->int 转换超出byte范围会成为负数，而不报错，与二进制有关？
 * @author ZhaoMin
 * @date 2019/12/4 10:36
 */
public class VariableTest1 {
    public static void main(String[] args) {
        double d1=12.3;
        int i1=(int)d1;//截断操作，只取整数，有精度损失
        System.out.println(i1);
        //没有精度损失
        long l1=123;
        short s2=(short)l1;
        System.out.println(s2);

        //精度损失 -128，从int到byte为什么不会报存不下的问题，而是负数
        int i2=130;
        byte b=(byte)i2;
        System.out.println(b);
    }
}
