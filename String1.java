public class String1 {
    public static void main(String[] args){
        String s1=new String("abc");//字符串常量
        String s2=new String(s1);//字符串对象
        String s5=new String("ABC");
        char[] value=new char[]{'A','B','C','D','E','F','G','H'};
        String s3=new String(value);
        String s4=new String(value,3,4);
        String s6=new String("abcddcbabc");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s3.charAt(3));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareToIgnoreCase(s5));
        System.out.println(s3.concat("zhaomin"));
        System.out.println(s3.endsWith("GH"));
        System.out.println(s6.indexOf('C'));
        System.out.println(s6.indexOf('a',2));
        System.out.println(s6.indexOf("abc"));
        System.out.println(s6.indexOf("ab",3));
        System.out.println(s6.lastIndexOf('d'));
        System.out.println(s6.lastIndexOf('d',3));
        System.out.println(s6.lastIndexOf("abc"));
        System.out.println(s6.lastIndexOf("abc",5));
    }
}
