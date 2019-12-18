package dataType20191204;

/**
 * 1.String属于引用数据类型
 * 2.声明String类型变量时，必须使用一对""
 * 3.String 可以和8种基本数据类型做运算，且运算只能是连接运算+
 * 4.boolean也可以进行运算
 * 5.运算结果热仍然是String类型
 * @author ZhaoMin
 * @date 2019/12/5 23:49
 */
public class StringTest {
    public static void main(String[] args) {
        String s1="hello World";
        System.out.println(s1);
        String s2="a";
        String s3="";//String“”里边可以不写
        System.out.println(s3);
       // char c='';//char''里边必须写
        //3++++++++++++++和基本数据类型做运算++++++++++++++++++++++
        int number=1001;
        String numberStr="学号:";
        String info=numberStr+number;//+连接运算
        System.out.println(info);
        boolean b1=true;
        String info1=info+b1;
        System.out.println(info1);

        //****************练习1*******************
        char c='a';//97 A:65
        int num=10;
        String str="hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str+num+c);//hello10a
        //****************练习2*******************
        //打印* *
        System.out.println("*   *");//可以
        System.out.println('*'+'\t'+'*');//93，char相加
        System.out.println('*'+"\t"+'*');//可以
        System.out.println('*'+'\t'+"*");//51*
        System.out.println('*'+('\t'+"*"));//可以
        //****************练习2*******************
        String str1=3.5f+"";//"3.5",不能加f
        //****************几种错误写法*******************
       // String s=8;//必须加”“
        //int num=str1;
        //int num=(int)str1;
    }

}
